package com.github.miyashy.infrastructures

import com.github.miyashy.infrastructures.converter.StringToUserIdConverter
import com.github.miyashy.infrastructures.converter.TodoIdToStringConverter
import com.github.miyashy.infrastructures.converter.TodoStatusToIntConverter
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@EnableJdbcRepositories
@Configuration
class SpringDataJdbcConfig : AbstractJdbcConfiguration() {
    override fun jdbcCustomConversions(): JdbcCustomConversions {
        return JdbcCustomConversions(
                listOf(TodoIdToStringConverter, TodoStatusToIntConverter))
    }
}