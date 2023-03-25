package chap03.section5

fun main(){
    val number = 5
    println("Factorial : $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1) : Long{
    // 내부에 루프를 만들어서 정해진 횟수까지 계산을 한 다음에 결과를 리턴하는 형태.
    return if(n==1) run.toLong() else factorial(n-1, run*n)
}