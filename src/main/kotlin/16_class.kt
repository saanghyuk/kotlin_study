
fun main(){
    println(Test().a)
    println(Test2(null).b)
    Test3().test3Fun();
    val myInfo = MyInfo();
    println(myInfo.getMyAge())
    println(myInfo.getMyName())
    println(myInfo.getMyLocation())

    val dog = Dog("파트라슈", 20)
    println(dog.getMyDogInfo())
    val dog2 = Dog("파트라슈 친구", 10)
    println(dog2.getMyDogInfo())

    initTest()
}

class Test{
    val a = "abc"
}

class Test2(str : String?){
    val b = str;
}

class Test3(){
    fun test3Fun(){
        println("test3Fun 출력")
    }
}

class MyInfo(){
    fun getMyAge() : Int{
        return 20
    }
    fun getMyName() : String {
        return "Noel"
    }
    fun getMyLocation() : String {
        return "Seoul"
    }
}

class Dog(name : String, age: Int){
    val dogName = name;
    val dogAge = age;
    fun getMyDogInfo() : String{
        return "$dogName : $dogAge"
    }
}


class initTest(){
    init{
        println("Init에서 뭔가 해주고 싶음")
    }
    fun testInitFun(){
        println("testInitFun")
    }
}

class InitialValue(name: String, age: Int = 20){
    init{
        println(name);
        println(age)
    }
}