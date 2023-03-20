import kotlin.math.*
//import kotlin.math.abs
import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin");
    val person = User("Kildong", 20)
    val person2 = Person(123, "gildong", "programer")
    println(person)
    println(person.name)
    println(person.age)



    println(PI)
    println(abs(-12.6))
}

class Person(val no: Int, val name: String, val jobTitle: String ){

}