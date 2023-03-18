
fun main(){
    Bmw().wheel()
    Bmw().engine()

}

//open class Car(){
//    open fun wheel(){
//        println("굴러갑니다")
//    }
//    open fun engine(){
//        println("시동이 켜졌습니다.")
//    }
//}
//class Bike() : Car(){
//    override fun wheel(){
//        println("자전거가 굴러갑니다")
//    }
//}
// 추상클래스
abstract class Car1{
    abstract fun wheel();
    abstract fun engine();
}


class Bmw1() : Car1() {
    override fun engine() {
        println("BMW 엔진")
    }

    override fun wheel() {
        println("BMW 굴러간다")
    }
}