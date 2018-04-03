package red.sukun1899.kotlin.boot.todolist.repsitory

import red.sukun1899.kotlin.boot.todolist.data.Task

/**
 * @author su-kun1899
 */
interface TaskRepository {
    fun create(content: String): Task
    fun update(task: Task)
    fun findAll(): List<Task>
    fun findById(id: Long): Task?
}