
fun main(){
    val c = Calculator()
    c.sumNumberTwo(1, 2)
    c.sumNumberThree(1, 2, 3)
}

class Calculator(){
    fun sumNumberTwo(a: Int, b: Int){
        println(a + b);
    }
    fun sumNumberThree(a:Int, b:Int, c:Int){
        println(a+b+c)
    }
    fun sumNumber(a:Int, b:Int){
        println(a+b)
    }
    fun sumNumber(a:Int, b:Int, c:Int){
        println(a+b)
    }
    fun sumNumber(a: String, b:String){
        println(a+b)
    }
}