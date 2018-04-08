package red.sukun1899.kotlin.boot.todolist.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
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

    @GetMapping("new")
    fun new(form: TaskCreateForm): String {
        return "tasks/new"
    }

    @PostMapping
    fun create(@Validated form: TaskCreateForm,
               bindingResult: BindingResult): String {
        if (bindingResult.hasErrors()) {
            return "tasks/new"
        }
        val content = requireNotNull(form.content)
        taskRepository.create(content)
        return "redirect:/tasks"
    }
}