
//late init, lazy
fun main(){
    var justString: String = "아무거나 String"
    println(justString)


    justString = "변경된 String"
    println(justString)

    lateinit var lateString : String
    lateString = "a"
    lateString ="B"
    lateString = "변경된 String"
    println(lateString)

    val lazyString : String by lazy {
        println("이 친구가 만들어질때 print")
        "lazyTestString"
    }

//    println(lazyString)

}