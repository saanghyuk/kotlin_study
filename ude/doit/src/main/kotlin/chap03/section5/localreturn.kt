package chap03.section5.localReturn

fun main(){
    shortFunc(3) {
        println("First Call $it")
        return
    }
}

inline fun shortFunc(a: Int, out : (Int) -> Unit){
    println("Before Calling out()")
    out(a)
    println("After Calling out()") // 실행되지 않음
}