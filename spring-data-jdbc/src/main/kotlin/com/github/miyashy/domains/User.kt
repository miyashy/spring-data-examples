package com.github.miyashy.domains

import com.github.miyashy.domains.values.UserId
import org.springframework.data.relational.core.mapping.Table

@Table("users")
data class User(val id: UserId, val name: String) {
    companion object {
        fun create(name: String): User {
            return User(UserId.create(), name);
        }
    }
}