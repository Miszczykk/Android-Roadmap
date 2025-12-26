package week7

class Rectangle(val width: Int, val height: Int){
    fun calculateArea(): Int{
        return width * height
    }
}
fun main(){
    val rect1 = Rectangle(5, 10)
    val rect2 = Rectangle(2, 3)
    println(rect1.calculateArea())
    println(rect2.calculateArea())
}