package com.github.miyashy.domains.values

enum class TodoStatus(override val code: Int) : CodeMapping{
    todo(0),
    inProgress(1),
    done(2);
}