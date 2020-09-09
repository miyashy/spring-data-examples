package com.github.miyashy.services

import com.github.miyashy.domains.Todo
import com.github.miyashy.domains.repository.TodoRepository
import com.github.miyashy.domains.values.UserId
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TodoService(val repository: TodoRepository) {
    @Transactional(readOnly = true)
    fun get(id: UserId): Todo {
        return repository.findByIdOrNull(id) ?: throw Exception("${id.value} not found.")
    }

    @Transactional()
    fun create(summary: String, description: String): Todo {
        val todo = Todo.create(summary, description)
        return repository.save(todo)
    }

    @Transactional
    fun toInProgress(id: UserId) : Todo{
        val todo = repository.findByIdOrNull(id) ?: throw Exception("${id.value} not found.")
        return repository.save(todo.inProgress())
    }

    @Transactional
    fun toDone(id: UserId) : Todo {
        val todo = repository.findByIdOrNull(id) ?: throw Exception("${id.value} not found.")
        return repository.save(todo.done())
    }

    @Transactional
    fun delete(id: UserId) {
        val todo = repository.findByIdOrNull(id) ?: throw Exception("${id.value} not found.")
        repository.delete(todo)
    }
}