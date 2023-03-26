package chap03.section5

fun main(){
    a()
}


fun a() = b()
fun b() = println("b")
fun c(){
    fun e() = println("e")
    fun d() = e()
    e()
}

