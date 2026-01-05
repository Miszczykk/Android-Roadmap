package week10
import kotlin.math.PI

open class Shape{
    open fun area(): Double{
        return 0.0
    }
}

class Square(val side: Double) : Shape(){
    override fun area(): Double{
        return side * side
    }
}

class Circle(val radius: Double): Shape(){
    override fun area(): Double{
        return PI * radius * radius
    }
}

fun main(){
    val shapes: List<Shape> = listOf(Square(4.0), Circle(3.0))

    for(shape in shapes){
        println(shape.area())
    }
}