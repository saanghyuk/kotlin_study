fun main(){
    println(10 sum1 20)
    println(10 sum2 20)
    println(10 multi1 20)
    println(10 showList 20)
}

infix fun Int.sum1(num : Int) : Int = this + num;
infix fun Int.sum2(num : Int) : Int = this + num;
infix fun Int.multi1(num : Int) : Int = this * num;

infix fun Int.sum3(num: Int) : Int {
    return this + num
}

infix fun String.sum150(abc: String) : String = this + abc;

infix fun Int.showList(num : Int) : List<Int> {
    val list = mutableListOf<Int>();
    for (i in this..num){
        list.add(i)
    }
    return list
}
fun sum25(a: Int, b: Int): Int{
    return a+b;
}