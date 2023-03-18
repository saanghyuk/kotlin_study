/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

	val a = "Male"
    val b = 20

    // AND
    if(a == "Male" && b>=20){
        println("AND 만족")
    } else {
        println("AND 불만족")
    }

    // OR
    if( a == "Male" || b <= 20){
        println("")
    }


    val student = mutableMapOf<Int, String>()
    student[99] = "민지"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "하영"
    student[22] = "수진"
    student[45] = "수달"
    student[88] = "캥거루"
    student[91] = "코알라"
    student[87] = "악어"
    student[54] = "코끼리"
    student[42] = "하마"

    // 학생들 중 점수가 50점 이상이고 학생의 이름 길이가 3 이상인 친구들만 프린트 해라.
    for (i in student){
        if(i.key >= 50 && i.value.length >= 3){
            println(i.value)
        }

    }

}
