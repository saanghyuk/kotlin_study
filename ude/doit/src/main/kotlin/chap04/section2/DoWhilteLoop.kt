package chap04.section2

fun main(){
    println(0%3)
    println(1%3)
    println(2%3)
    do{
        print("Enter an integer")
        var input = readLine()!!.toInt()

        for(i in 0..(input - 1)){
            for (j in 0..(input-1)) print((i+j) % input +1)
            println()
        }
    } while (input != 0)
}