package com.github.miyashy.infrastructures

import com.github.miyashy.domains.Todo
import com.github.miyashy.domains.repository.TodoRepository
import com.github.miyashy.domains.values.UserId
import org.springframework.data.repository.CrudRepository

interface TodoRepositoryImpl : TodoRepository, CrudRepository<Todo, UserId> {
    @JvmDefault
    override fun findByIdOrNull(id: UserId): Todo? = findById(id).orElse(null)
}