package com.github.miyashy.domains.repository

import com.github.miyashy.domains.Todo
import com.github.miyashy.domains.values.UserId

interface TodoRepository {
    fun save(todo: Todo): Todo
    fun delete(todo: Todo)
    fun findByIdOrNull(id: UserId): Todo?
}