package red.sukun1899.kotlin.boot.todolist

import org.springframework.jdbc.core.JdbcTemplate

/**
 * @author su-kun1899
 */
inline fun <reified T> JdbcTemplate.queryForObject(sql: String): T? =
        queryForObject(sql, T::class.java)