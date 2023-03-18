

fun main(){
//    Parents().doing();
//    Parents().disease();
    Child().doing();
    Child().disease();
}

open class Parents(){

    fun doing(){
        println("자식을 돌봅니다")
    }
    open fun disease(){
        println("비염이 있습니다.")
    }
}

class Child() : Parents(){
    override fun disease(){
        super.disease()
        println("자식 Disease함수")
    }
}

