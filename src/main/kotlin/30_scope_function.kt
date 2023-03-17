
fun main(){
//
//    val str10: String = "Hi";
////    println(str10?.length);
//    val length10 = str10.let{
//        println(it)
//        it.length
//    }
//    println(length10)
//
//    val str100: String? = null
////    println(str10?.length);
//    val length100 = str100.let{
//        println(it)
//        println("실행실행")
//        it?.length
//    }
//    println(length100)

//    val numbers = mutableListOf("a", "b", "c", "d")
//    println(numbers.first())
//    println(numbers.last())
//    val firstAndLast = with(numbers){
//        "${first()} ${last()}"
//    }
//    println(firstAndLast)

    // run
//    var service = multiPortService("www.naver.com", 80)
//    val result1 = service.query(service.prepareRequest() + " to port ${service.port}")
//    println(result1)
//
//    var result2 = service.run{
//        port = 8000
//        query(prepareRequest() + " port $port")
////        "i"
//    }
//    println(result2)

    var tester1 = Person("Tester1")
    println(tester1)
    tester1.age = 20
    tester1.city = "Seoul"


    var tester2 = Person("Tester2").apply{
        age = 21
        city = "Busan"
    }

    println(tester2)

    val numbers = mutableListOf(1, 2, 3, 4)
    println("$numbers 여기에서 5를 추가합니다")
    numbers.add(5)
    println(numbers)

    val numbers2= mutableListOf(1, 2, 3, 4)
    numbers2.also{
        println("$numbers 여기에서 5를 추가합니다")
    }.add(5)
    println(numbers2)

}


//class multiPortService(var url: String, var port : Int){
//    fun prepareRequest() : String = "기본 요청 url $url"
//    fun query(request : String) = "결과 query $request"
//}

data class Person(
    var name : String,
    var age: Int =0,
    var city : String = ""
)