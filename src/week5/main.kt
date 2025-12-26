package week5

fun main(){
    val payments = listOf<String>("Paid", "Unpaid", "Paid", "Unpaid", "Unpaid")
    var unpaidCount = 0

    for(i in 0..payments.size-1){
        if(payments[i] == "Unpaid"){
            println("Alert: User nr [$i] didn't pay!")
            unpaidCount++
        }
    }
    println("Sum unpaid: $unpaidCount")
}