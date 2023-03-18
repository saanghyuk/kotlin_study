/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

    // 문자열 가공
    // Split
	//val testString = "동해물과 백두산이 마르고 닳도록"
    // val newTestString = testString.split(" ")
    // println(newTestString)
    // println(newTestString[0])


    //
    //val testString = "동해물과 백두산이 마르고 닳도록"
    //val a = testString[1]
    //val b = testString[2]
	//println(a.toString()+b.toString())
    //val splitString = testString.substring(0, 2)
    //println(splitString)


    val testString = "동해물과 백두산이 마르고 닳도록"
    val replaceValue = testString.replace("백두산", "한라산")
    println(replaceValue)

    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc1@gmail.com")
    testList.add("abc1@lycos.com")
    testList.add("abc1@daum.com")
    testList.add("abc1@kakao.com")
    testList.add("abc1@outlook.com")

    // 이메일이 naver만 가져오고 싶다.
    // 2가지 방법
    // 첫번째 방법 : 네이버 라는 텍스트가 포함되었는지 찾기 => 그러나, naver@gmail.com도 잡힌다.

    // 두번째 방법 : @뒤에 텍스트가 있고, 그 다음이 .이 이어진 이메일이 몇 개인지 찾기
    // 내 풀이
    for(i in testList){
        val j = i.split("@")[1]
        if(j.contains("naver.")){
            println(i)
        }
    }

    // 모범답안
    val emailList = ArrayList<String>()
    var count = 0
    for(item in testList){
        emailList.add(item.split("@")[1].split(".")[0])
    }
    for (item in emailList){
    	if(item == "naver"){
                count++
            }
    }
    println(emailList)
    println(count)




}
