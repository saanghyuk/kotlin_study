import com.example.edu.Person as User

fun main(){
    println("Hello Kotlin")

    val person = User(name="Kildong", age = 20)
    val person2 = Person(no=123, name="Noel", "Programmer")
    println(person)
    println(person.name)
    println(person.age)
    println(person2)
}


class Person(val no: Int, val name: String, val jobTitle: String)