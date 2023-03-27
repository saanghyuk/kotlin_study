package chap04.section3

fun main(){
    retFunc()
}


inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}

//fun retFunc(){
//    println("Start of retFunc")
////    inlineLambda(13, 3) lit@{ a, b ->
//    inlineLambda(13, 3) { a, b ->
//        val result = a+b
//        if(result>10) return@inlineLambda
//        println("result : $result")
//    }
//    println("End of retFunc")
//}


fun retFunc(){
    println("Start of retFunc")
    inlineLambda(13, 3, fun(a, b){
            val result = a+b
            if(result>10) return
            println("result : $result")
    })
    println("End of retFunc")
}