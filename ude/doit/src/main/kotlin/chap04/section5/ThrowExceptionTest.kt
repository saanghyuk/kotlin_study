package chap04.section5

import java.lang.Exception

fun main(){
    var amount = 100
    try{
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception){
        println(e.message)
    }
    println("amount : $amount")
}


fun checkAmount(amount :Int){
    if(amount < 100){
        throw Exception("잔고가 부족하다")
    }
}