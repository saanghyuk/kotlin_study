package chap04.section1

class MyClass
fun main(){
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
}


fun cases(obj: Any){
    when (obj){
        1 -> println("Int : $obj")
        "Hello" -> println("String : $obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}