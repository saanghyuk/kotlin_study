package chap03.section5

fun main(){
    shortFunc(3) {println("FirstCall : $it")}
    shortFunc(5) {println("FirstCall : $it")}
}

inline fun shortFunc(a: Int, noinline out : (Int) -> Unit){
    println("Before calling out()");
    out(a)
    println("After calling out()");
}