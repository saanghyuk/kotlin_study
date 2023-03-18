fun main(){

    println(Direction.NORTH)
    Direction.values().forEach {
        println(it)
    }

    CustomerType.values().forEach {
        println(it)
    }

    val direction = Direction.EAST
    when(direction) {
        Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.EAST -> {
            println("E")
        }
        Direction.WEST -> {
            println("W")
        }
    }

    val color = Color.RED
    when (color){
        Color.RED -> {
            println(Color.RED.rgb)
        }
        Color.GREEN -> {
            println(Color.GREEN.rgb)
        }
        Color.BLUE -> {
            println(Color.BLUE.rgb)
        }
    }

    println(Device.DEVICEON.status)
    Device.DEVICEON.status = "OFF"
    println(Device.DEVICEON.status)
}

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}


enum class CustomerType{
    A, B, C, D, E
}

enum class Color(var rgb : Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Device(var status : String){
    DEVICEON("ON"),
    DEVICEOFF("OFF"),
    LOCATION("SEOUL"),
}