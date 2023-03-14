fun main(){
    val test1 = Test10.Test1NestedClass()
    test1.testFun1()

    val test2 = Test20().Test2InnerClass();
    test2.testFun2()
}

class Test10{

    val tempText1 = "tempText1"
    class Test1NestedClass{
        fun testFun1(){
            println("TestFun1")
//            println(tempText1)
        }
    }
}


class Test20 {
    val tempText2 = "tempText2"
    inner class Test2InnerClass{
        fun testFun2(){
            println("TestFun2")
            println(tempText2)
        }
    }
}