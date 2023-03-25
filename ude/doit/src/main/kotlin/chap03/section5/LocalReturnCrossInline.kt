package chap03.section5.crossinline

fun main(){
    shortFunc(3){
        println("$it")
        return
    }

}

inline fun shortFunc(a: Int, out: (Int) -> Unit){
    println("Before Calling out()")
//    nestedFunc { out(a) } // nestedFunc는 인라인 되지는 않는다.
//    out(a)
    println("After Calling out()") // 실행되지 않음
}


fun nestedFunc(body: () -> Unit){
    body()
//    return
}