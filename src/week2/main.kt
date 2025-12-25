import week2.BankAccount
import week2.CheckingAccount
import week2.InterestBearing
import week2.SavingsAccount

fun isPalindrome(input: String):Boolean{
    var i = 0
    var j = input.length-1
    while(i < j){
        while(!input[i].isLetter()){
            i++
        }
        while(!input[j].isLetter()){
            j--
        }
        if(input[i].lowercaseChar() != input[j].lowercaseChar()){
            return false
        }
        i++
        j--
    }
    return true
}

fun main(){
    val accounts: List<BankAccount> = listOf(
        SavingsAccount("OSZCZ-001", 5000.0).withdraw(5000.0),
        CheckingAccount("ROR-001", 200.0).withdraw(1200.0),
        SavingsAccount("OSZCZ-002", 10000.0).withdraw(1200.0),
        CheckingAccount("ROR-002", 500.0).withdraw(1200.0)
    ) as List<BankAccount>

    for (account in accounts){
        account.printDetails()
        if(account is InterestBearing){
            println(account.calculateInterest())
        }
    }
}