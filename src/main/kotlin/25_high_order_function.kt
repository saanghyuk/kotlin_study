fun main(){
    println(testSum(1, 2))
    println(testLambdaSum(1, 2))

    sum100(1, 2, {a:Int, b:Int  -> a+b})
    sum100(1, 2, ::testSum)
    sum100(1, 2) {a:Int, b:Int  -> a+b}

    printTest("abc")
    highPrintTest(::printTest)
}

fun sum100(a: Int, b:Int, operation : (Int, Int) -> Int){
    println(a+b)
    println(operation(a, b))
}

fun printTest(str: String) : Unit{
    println(str)
}

fun highPrintTest(operation: (String) -> Unit){
    operation("bbb")
}

fun testSum(a: Int, b: Int) : Int {
    return a+b
}

val testLambdaSum = {a: Int, b: Int -> a+b}