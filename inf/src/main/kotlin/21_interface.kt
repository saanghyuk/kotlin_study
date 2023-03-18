fun main(){

    Bmw().engine()
    Bmw().wheel()
    Bmw().autoDriving()
    Benz().autoParking()
}

abstract class Car {
    abstract fun wheel()
    abstract fun engine()
}

class Bmw() : Car(), CarAutoDriving{
    override fun engine() {
        println("Hi")
    }

    override fun wheel() {
        println("Bye")
    }

    override fun autoDriving() {
        println("Overriding autoDriving")
    }
}

class Benz() : Car(), CarAutoParking{
    override fun engine() {
        println("Hi")
    }

    override fun wheel() {
        println("Bye")
    }

    override fun autoParking() {
        println("autoparking")
    }
}

interface CarAutoDriving {
    fun autoDriving()
    
}
interface CarAutoParking{
    fun autoParking()
}