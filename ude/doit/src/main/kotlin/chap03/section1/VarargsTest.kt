package chap03.section1


fun main(args: Array<String>){
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

// vararg를 사용하면 배열을 갖게 된다.
fun normalVarargs(vararg counts: Int){
    println(counts)
    for (num in counts){
        println("$num")
    }
    println("\n")
}