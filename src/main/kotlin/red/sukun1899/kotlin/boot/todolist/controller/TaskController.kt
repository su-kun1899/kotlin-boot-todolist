package red.sukun1899.kotlin.boot.todolist.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import red.sukun1899.kotlin.boot.todolist.data.Task

/**
 * @author su-kun1899
 */
@RestController
class TaskController {

    @GetMapping("")
    fun index(model: Model): String {
        val task = listOf(
                Task(1, "障子を張り替える", false),
                Task(2, "定期検診に行く", true)
        )
        return task.toString()
    }
}