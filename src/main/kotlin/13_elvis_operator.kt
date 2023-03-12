fun main(){
//    var testStr : String = ""
//    println(testStr)
//    var testStr2 = null
//    println(testStr2)
//
//    var testStr3 : String ="abcd";
//    var testStr4 : String? =null;
//

    println(findStringLength4(null))

}

//fun findStringLength1(str: String?): Int?{
//    println(str?.length);
//    return str?.length;
//}

fun findStringLength3(str: String?) : Int{
    var resultCount = 0
    if(str != null){
        resultCount = str.length
    }
    return resultCount
}


fun findStringLength4(str: String?) : Int{

    return str?.length ?: 0
}

