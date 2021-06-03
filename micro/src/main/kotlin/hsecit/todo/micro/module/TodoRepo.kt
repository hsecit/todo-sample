package hsecit.todo.micro.module

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
@Repository
public interface TodoRepo : JpaRepository<TodoEntity, Long> {
    fun findByStatus(status :String) :List<TodoEntity>;
}
