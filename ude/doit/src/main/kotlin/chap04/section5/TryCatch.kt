package chap04.section5

import java.lang.Exception

fun main(){
    val a= 6
    val b =0
    val c: Int

    try{
        c = a/b
    }catch (e: Exception){
        println("Exception is handled")
    }finally {
        println("Finally")
    }
}