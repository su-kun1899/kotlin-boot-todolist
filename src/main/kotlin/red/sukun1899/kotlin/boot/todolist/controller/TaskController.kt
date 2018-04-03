package red.sukun1899.kotlin.boot.todolist.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import red.sukun1899.kotlin.boot.todolist.repsitory.TaskRepository

/**
 * @author su-kun1899
 */
@Controller
@RequestMapping("tasks")
class TaskController(private val taskRepository: TaskRepository) {

    @GetMapping("")
    fun index(model: Model): String {
        val tasks = taskRepository.findAll()
        model.addAttribute("tasks", tasks)

        return "tasks/index"
    }
}