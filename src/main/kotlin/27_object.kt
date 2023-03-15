fun main(){
    val test1 = TestClass();
    val test2 = TestClass();
    test1.count = 10;
    println(test1.count)
    println(test2.count)

    val test3 = testObject;
    val test4 = testObject;
    test3.count =10;
    println(test3.count)
    println(test4.count)

    val test5 = TestObjectClass()
    val test6 = TestObjectClass()
    test5.plusBtn()
    println(TestObjectClass.number)
    test5.plusBtn()
    println(TestObjectClass.number)
    test6.minusBtn()
    println(TestObjectClass.number)

}


object testObject{
    init {
        println("testObject")
    }
    var count =0;
}
class TestClass{
    init{
        println("testClass")
    }

    var count =0;
}

class TestObjectClass {
    companion object {
        var number =0
    }
    fun plusBtn(){
        number++
    }
    fun minusBtn(){
        number--
    }
}