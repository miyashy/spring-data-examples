package com.github.miyashy.domains.values

import java.util.*

data class UserId (val value: String) {
    companion object {
        fun create() : UserId {
            return UserId(UUID.randomUUID().toString());
        }
    }
}