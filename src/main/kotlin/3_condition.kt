// Type

fun main() {
	val studentScore1 = 100;
    if(studentScore1 > 50){
        println("150 이상")
    } else {
        println("150 이상이 아님")
    }

    val studentScore2 = 50
    if(studentScore2 > 50){
        println("50을 초과")
    }
    if(studentScore2 >= 50){
        println("50 이상")
    }

    val studentScore3 = 70
    if(studentScore3 <= 70){
        println("70이하")
    }
    if(studentScore3 > 70){
        println("70미만")
    }

    val studentScore4 = 80
    if(studentScore4 > 100){
        println("100보다 큼")
    } else if (studentScore4 > 50){
        println("50보다 큼")
    } else if (studentScore4 > 30){
        println("30보다 큼")
    } else{
        println("30보다 작음")
    }

    val score = 100;
    when(score) {
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        80 -> {
            println("80")
        }
        else -> {
            println("No")
        }
    }

}
