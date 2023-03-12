fun main(){
//    var str2 : Any = "abc";
//    println(str2);
//    str2 = 123;
//    println(str2)

//    var str3 : Any = 3;
//    println(str3::class.java.simpleName)
//    println(str3 is String);
//    if(str3 is String) {
//        println("This is String")
//    } else {
//        println("This is not String")
//    }

    var str4 : Any = "abc"
    when(str4){
        is Int -> {println("this is int")}
        is String -> {println("this is String")}
        else -> {
            println("this is nothing")
        }
    }

//    var str5 : String = "abc"
//    var str6 : String = str5 as String
//    println(str6)
//    var str7 : Int = 1
//    var str8 : String = str7 as String;
//    println(str8)
    var str9: String? = 1 as? String;
    println(str9);
}