package com.github.miyashy.infrastructures.converter

import com.github.miyashy.domains.values.CodeMapping
import com.github.miyashy.domains.values.TodoId
import com.github.miyashy.domains.values.TodoStatus
import org.springframework.core.convert.converter.Converter
import org.springframework.core.convert.converter.ConverterFactory
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter

@WritingConverter
object TodoIdToStringConverter: Converter<TodoId, String> {
    override fun convert(source: TodoId): String? {
        return source.value
    }
}

@ReadingConverter
object StringToUserIdConverter: Converter<String, TodoId> {
    override fun convert(source: String): TodoId? {
        return TodoId(source)
    }
}

@WritingConverter
object TodoStatusToIntConverter: Converter<Enum<*>, Int?> {
    override fun convert(source: Enum<*>): Int? {
        return source.ordinal
    }
}