package chap03.section1

fun main() {
    println(funcFunc())
}

fun sum6(a: Int, b: Int) = a+b
fun funcFunc(): Int {
    return sum6(2, 2)
}