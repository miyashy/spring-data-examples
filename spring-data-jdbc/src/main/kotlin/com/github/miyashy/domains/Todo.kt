package com.github.miyashy.domains

import com.github.miyashy.domains.values.TodoId
import com.github.miyashy.domains.values.UserId
import com.github.miyashy.domains.values.TodoStatus
import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table

@Table("todos")
data class Todo(@Id val todoId: TodoId,
                val summary: String,
                val description: String,
                val status: TodoStatus) : Persistable<TodoId> {
    companion object {
        fun create(summary: String, description: String) : Todo {
            return Todo(TodoId.create(), summary, description, TodoStatus.todo)
        }
    }

    fun inProgress() : Todo {
        return this.copy(status = TodoStatus.inProgress)
    }

    fun done() : Todo {
        return this.copy(status = TodoStatus.done)
    }

    override fun getId(): TodoId? {
        return todoId
    }

    override fun isNew(): Boolean {
        return true;
    }
}
