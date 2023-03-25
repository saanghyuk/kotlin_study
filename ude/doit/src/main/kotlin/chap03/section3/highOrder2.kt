package chap03.section3

fun main(){
    var result : Int
    result = highOrder({x, y -> x+y}, 10, 20)
    println(result)


    val result2 = highOrder(::sum, 10, 20)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}


fun sum(a: Int, b: Int) : Int = a+b