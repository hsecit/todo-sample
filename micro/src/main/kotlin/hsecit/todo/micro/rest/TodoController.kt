package hsecit.todo.micro.rest

import hsecit.todo.micro.module.TodoEntity
import hsecit.todo.micro.module.TodoRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
public class TodoController(private val todoRepo: TodoRepo) {

    @GetMapping("/")
    fun getAll(): List<TodoEntity> = todoRepo.findAll();

    @GetMapping("/{status}")
    fun getByStatus(@PathVariable(value = "status") status : String) : List<TodoEntity> = todoRepo.findByStatus(status)

    @PostMapping("/")
    fun addOne(@RequestBody todoEntity: TodoEntity) : TodoEntity = todoRepo.save(todoEntity);
}