fun main(){

    val box1 = Box1(10);
    println(box1.value)

    val box2 = Box2("숫자 10")
    println(box2.value)

    val box1_1 = Box1("10".toInt())
    println(box1_1.value)

    val box3 = Box3(10)
    println(box3.value)

    val box4 = Box3("10")
    println(box4.value)
}

class Box1(test: Int){
    val value = test;
}

class Box2(test: String){
    val value = test;
}
class Box3<T>(test: T){
    var value= test;
}

fun testFun1(a: String){
    println(a)
}

fun <T> testFun2(a: T){
    println(a)
}