package hsecit.todo.micro.module

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class TodoEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0,

    @get: NotBlank
     var goal : String ="something todo" ,

    @get: NotBlank
    var ended : String ="",

    @get: NotBlank
     var status : String ="ongoing",

    )