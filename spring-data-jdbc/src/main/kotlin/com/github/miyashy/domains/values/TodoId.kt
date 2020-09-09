package com.github.miyashy.domains.values

import java.util.*

data class TodoId(val value: String) {
    companion object {
        fun create() : TodoId {
            return TodoId(UUID.randomUUID().toString());
        }
    }
}