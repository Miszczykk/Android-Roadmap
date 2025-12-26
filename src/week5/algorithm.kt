package week5

fun main(){
    val expenses = listOf<Int>(120, 40, 300, 10, 500)
    var total = 0

    for(expense in expenses){
        if(expense > 50){
            total+=expense
        }
    }
    println(total)
}