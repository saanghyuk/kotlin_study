package chap03.section3

fun main(){
    val result : Int;

    val multi = {x: Int, y: Int ->
        println("x * y")
        x // ignored
        x*y
    }
    val multi2 : (Int, Int) -> Int = {x, y -> x*y}
//    val multi3 = {x: Int, y: Int -> x*y}

    val greet : () -> Unit = {println("Hello")}
    val nestedLambda : (Int) -> (Int) -> Int = {x -> { y -> x+y}}

    result = multi(10, 20)
    println(result)
    println(greet())
    val a = nestedLambda(10)(20)
    println(a)
}