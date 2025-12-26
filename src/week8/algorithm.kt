package week8

fun sumSafe(a: Int?, b: Int?): Int {
    return (a ?: 0) + (b ?: 0)
}
fun main(){
    println(sumSafe(10, 20))
    println(sumSafe(10, null))
    println(sumSafe(null, null))
}