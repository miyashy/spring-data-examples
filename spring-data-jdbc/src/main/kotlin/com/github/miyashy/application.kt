package com.github.miyashy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataJdbcSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringDataJdbcSampleApplication>(*args)
}
