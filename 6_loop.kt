fun main(){

    val testList6 = listOf("a", "b", "c", "d", "e", "f")
    for (i in testList6){
        println(i)
    }

    // 1부터 10까지 출력
    for (i in 1..10){
        println(i)
    }

    for (i in 1..10 step 2){
        println(i)
    }

    for ( i in 1..3){
        println("i의 값은 : $i")
    }

    // 중첩반복문
    for ( i in 1..3){
        for (j in 1..3){
            println("i is $i j is $j")
        }
    }
}
