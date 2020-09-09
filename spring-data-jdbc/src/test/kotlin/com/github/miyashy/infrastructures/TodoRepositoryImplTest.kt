package com.github.miyashy.infrastructures

import com.github.miyashy.domains.Todo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.context.annotation.Import

@DataJdbcTest
@Import(SpringDataJdbcConfig::class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoRepositoryImplTest(@Autowired val todoRepositoryImpl: TodoRepositoryImpl) {

    @Test
    fun `save new instance`() {
        val todo = Todo.create("サマリー", "説明文")
        todoRepositoryImpl.save(todo)
    }
}