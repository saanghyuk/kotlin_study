fun main(){
    println(a())
    println(b())

    println(sum10(1, 2))

    val sumNumber = {a:Int, b: Int -> a+b}
    println(sumNumber(1, 2))

    val sumTypeNumber: (Int, Int) -> Int = {a, b -> a+b}
    println(sumTypeNumber(1, 2))

    val sumTypeNumberNull: (Int, Int) -> Int? = {a, b -> null}
    println(sumTypeNumberNull(1, 2))


    println(sumString("1", "2"))

    val sumStringTwo = {a: String, b: String ->  "string1 : $a string2 : $b"}
    println(sumStringTwo("1", "2"))

    val sumStringTypeTwo : (String, String) -> String = {a, b -> "string1 : $a string2 : $b"}
    println(sumStringTypeTwo("1", "2"))

    val sumStringTypeTwoNull : (String, String) -> String? = {a, b -> null}
    println(sumStringTypeTwoNull("1", "2"))
}

fun a() : String{
    return "text"
}

fun b() = "text"

fun sum10(a:Int, b: Int) : Int {
     return a+b
}

fun sumString(a: String, b:String) : String {
    return "string1 : $a string2 : $b"
}