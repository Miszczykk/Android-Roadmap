package week12

class RegularBox(val size: Int)

data class DataBox(val size: Int)


fun main(){
    val r1 = RegularBox(10)
    val r2 = RegularBox(10)

    val d1 = DataBox(10)
    val d2 = DataBox(10)

    println("Regular comparison: ${r1 == r2}")
    println("Data comparison: ${d1 == d2}")
}