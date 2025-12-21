package week1

class Calculator {
    private var costs: Double = 0.0
    private var income: Double = 0.0
    private var taxRate: Int = 0
    fun readVariables(){
        print("Enter income: ")
        income = readln().toDoubleOrNull()?:0.0

        do{
            print("Enter costs: ")
            costs = readln().toDoubleOrNull()?:0.0
        }while(!checkPositiveNumber(costs))

       if(!checkTaxRate(income-costs)){
           taxRate = 0
       }else{
           do{
               print("Enter tax rate: ")
               taxRate = readln().toIntOrNull()?:0
           }while(!checkPositiveNumber(taxRate.toDouble()))
       }
        writeProceedsNetto()
    }
    private fun checkPositiveNumber(num:Double):Boolean{
        return num > 0
    }
    private fun checkTaxRate(result: Double):Boolean{
        return result > 0.0
    }
    private fun calculateProceeds(income: Double, costs: Double): Double{
        return income - costs
    }
    private fun calculateTax(proceeds: Double, rate: Int): Double{
        return proceeds * (rate.toDouble()/100)
    }
    private fun calculateProceedsNetto(): Double{
        val proceeds = calculateProceeds(income, costs)
        return proceeds - calculateTax(proceeds, taxRate)
    }
    private fun writeProceedsNetto(){
        println("Proceeds Netto is: ${calculateProceedsNetto()}")
    }
}

class FizzBuzz{
    private fun checkNumber(num: Int): String{
        return when{
            num % 15 == 0 -> "FizzBuzz"
            num % 3 == 0 -> "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> num.toString()
        }
    }
    fun isTheNumber(){
        for (i in 1..100){
            println("$i. ${checkNumber(i)}")
        }
    }
}

fun main(){
    FizzBuzz().isTheNumber()
    Calculator().readVariables()
}