package chap03.section3

fun main(){
    noParam({"Hello World"})
    noParam{"Hello World"}

    println(oneParam({ a -> "Hello World! $a" }))
    oneParam{ a -> "Hello World! $a" }
    oneParam{ "Hello World! $it" }
    moreParam({ a, b -> "Hello World! $a $b" })
}

fun noParam(out: () -> String) : Unit = println(out())

fun oneParam(out : (String) -> String): String {
    println(out("OneParam"))
    return "HI"
}
fun moreParam(out: (String, String) -> String){
    println(out("OneParam", "TwoParam"))
}



val add: (Int, Int) -> Int = { x, y -> x + y };