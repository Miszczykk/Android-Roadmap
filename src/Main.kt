class Main {
    fun generateNumber(): Int{
        return (0..100).random()
    }
    fun checkNumber(userNumber: Int, correctNumber: Int): Boolean{
        if(userNumber == correctNumber){
            println("Correct!")
            return true
        }else if(userNumber > correctNumber){
            println("Too big")
        }else{
            println("Too small")
        }

        return false
    }
}

fun main(){
    var numberOfAttempts = 0
    val randomNumber = Main().generateNumber()
    do {
        print("Enter your number: ")
        val userNumber = readln().toInt()
        numberOfAttempts += 1
    }while(!Main().checkNumber(userNumber, randomNumber))
    print("Number of attempts: $numberOfAttempts")
}