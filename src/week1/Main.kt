package week1

enum class Variant{
    CORRECT,
    TOO_BIG,
    TOO_SMALL
}
fun generateNumber(): Int{
    return (1..100).random()
}
fun checkNumber(userNumber: Int, correctNumber: Int): Variant{
    return when{
        userNumber == correctNumber -> Variant.CORRECT
        userNumber > correctNumber -> Variant.TOO_BIG
        else -> Variant.TOO_SMALL
    }
}

fun main(){
    var numberOfAttempts = 0
    val randomNumber = generateNumber()
    do{
        numberOfAttempts+=1
       print("Please enter your number: ")
        val userNumber = readln().toIntOrNull() ?: 0
        val result = checkNumber(userNumber, randomNumber)
        when (result) {
            Variant.CORRECT -> println("Correct! In $numberOfAttempts attempts.")
            Variant.TOO_BIG -> println("Too big!")
            Variant.TOO_SMALL -> println("Too small!")
        }
    }while(result != Variant.CORRECT)
}