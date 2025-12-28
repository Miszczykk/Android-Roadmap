package week9

open class NumberContainer(val value: Int){
    fun printValue(){
        println(value)
    }
}
class DoubleNumber(value: Int) : NumberContainer(value){
    fun printDouble(){
        println(value * 2)
    }
}
fun main(){
    val myNumber = DoubleNumber(10)
    myNumber.printValue()
    myNumber.printDouble()
}