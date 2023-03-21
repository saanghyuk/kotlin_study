package chap02.section3

fun main(){
    val a : Int = 128;
    val b = a;

    println(a === b);
    val c : Int? = a;
    val d : Int? = a
    val e : Int?  = c

    println(c == d)
    println(c === d) // 값만 할당했을 뿐이지 서로 다르다.
    println(c === e)


    println("-----------------")
    val f : String = "a"
    val q : String = "a"
    println(f === q);
    println(f == q)

    val g1 = 1.5f
    val g2 = 1.5f
    println(g1 === g2)

// -128 ~ 128는 캐시로 저장된다.
}