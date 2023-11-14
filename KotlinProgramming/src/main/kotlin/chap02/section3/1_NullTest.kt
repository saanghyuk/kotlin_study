package chap02.section3

fun main(){
    var str1: String? = "Hello Kotlin"
    str1 = null
//    println(str1?.length)
//    println(str1!!.length)

    val len = if(str1 != null) str1.length else -1
    println(len)
    println(str1?.length ?: -1);
}