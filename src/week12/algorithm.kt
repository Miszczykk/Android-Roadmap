package week12

class RegularBox(val size: Int)

data class DateBox(val size: Int)


fun main(){
    val r1 = RegularBox(10)
    val r2 = RegularBox(10)

    val d1 = DateBox(10)
    val d2 = DateBox(10)

    println("Regular comparison: ${r1 == r2}")
    println("Data comparison: ${d1 == d2}")
}