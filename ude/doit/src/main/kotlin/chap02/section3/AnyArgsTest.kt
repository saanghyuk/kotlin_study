package chap02.section3

fun main(){
    checkArg("Hello")
    checkArg(5)
}


fun checkArg(x: Any){
    if(x is String){
        println("String")
    } else if(x is Int){
        println("Int")
    }
}