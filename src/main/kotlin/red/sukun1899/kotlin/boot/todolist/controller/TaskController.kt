package red.sukun1899.kotlin.boot.todolist.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import red.sukun1899.kotlin.boot.todolist.data.Task

/**
 * @author su-kun1899
 */
@Controller
@RequestMapping("tasks")
class TaskController {

    @GetMapping("")
    fun index(model: Model): String {
        val tasks = listOf(
                Task(1, "障子を張り替える", false),
                Task(2, "定期検診に行く", true)
        )
        model.addAttribute("tasks", tasks)

        return "tasks/index"
    }
}