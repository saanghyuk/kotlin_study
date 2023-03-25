package chap03.section3.funarg


fun sum(a: Int, b: Int) = a+b
fun mul(a: Int, b: Int) = a*b


fun main(){
    val res1 = sum(3, 2)
    val res2 = mul(sum(3, 3), 3)
    println("${res1}, ${res2}")

    println(funcFunc())
}

fun funcFunc(): Int{
    return sum(2 ,2 )
}