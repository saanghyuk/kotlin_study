package chap03.section1

fun main(){
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> println("x*y")
        x*y
    }
    val c = multi(3, 6)
    println(c)
}