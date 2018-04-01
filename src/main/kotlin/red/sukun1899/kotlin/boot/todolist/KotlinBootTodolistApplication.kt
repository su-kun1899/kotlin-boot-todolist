package red.sukun1899.kotlin.boot.todolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootTodolistApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootTodolistApplication>(*args)
}
