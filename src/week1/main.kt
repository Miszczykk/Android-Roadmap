package week1
class TaxCalculator {
    private fun calculateProceed(income: Double, costs: Double): Double{
        return income - costs
    }
    private fun calculateTax(proceed: Double, rate: Int): Double{
        return proceed * (rate.toDouble() / 100)
    }
    fun calculateNetProceed(income: Double, costs: Double, taxRate: Int): Double{
        val proceed = calculateProceed(income, costs)
        println(calculateTax(proceed, taxRate))
        println(proceed)
        return proceed - calculateTax(proceed, taxRate)
    }
}

class FizzBuzz{
    private fun convertToString(num: Int): String{
        return when{
            num % 15 == 0 -> "FizzBuzz"
            num % 3 == 0 -> "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> num.toString()
        }
    }
    fun printFizzBuzz(){
        for (i in 1..100){
            println("$i. ${convertToString(i)}")
        }
    }
}

fun main(){
    print("Enter income: ")
    val income = readln().toDoubleOrNull()?:0.0
    var costs: Double
    var taxRate: Int
    do{
        print("Enter costs: ")
        costs = readln().toDoubleOrNull()?:0.0
    }while(costs < 0.0)

    if(income - costs <= 0.0){
        taxRate = 0
    }else{
        do{
            print("Enter tax rate: ")
            taxRate = readln().toIntOrNull()?:0
        }while(taxRate < 0.0)
    }
    println(TaxCalculator().calculateNetProceed(income, costs, taxRate))
    FizzBuzz().printFizzBuzz()
}