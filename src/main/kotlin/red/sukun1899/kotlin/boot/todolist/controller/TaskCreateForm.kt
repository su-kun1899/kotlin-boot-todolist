package red.sukun1899.kotlin.boot.todolist.controller

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

/**
 * @author su-kun1899
 */
class TaskCreateForm {
    @NotBlank
    @Size(max = 20)
    var content: String? = null
}