package chap02.section3

fun main(){
    var str1 : String? = "Hello, Kotlin"
    str1 = null;
    println("str: $str1")

    var num : Int? = null;
    println(num)


    println("str : $str1 length: ${str1?.length}")
    str1 = null
    // println("str : $str1 length: ${str1!!.length}") : NPE

    val len = if(str1 != null) str1.length else -1
    println("str1 : $str1 length : ${len}")

    println("str1 : $str1 length ${str1?.length ?: -1}")


}