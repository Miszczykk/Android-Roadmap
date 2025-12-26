import week2.BankAccount
import week2.CheckingAccount
import week2.InterestBearing
import week2.SavingsAccount

fun isPalindrome(input: String):Boolean{
    var i = 0
    var j = input.length-1
    while(i < j){
        while(!input[i].isLetterOrDigit() && i < j){
            i++
        }
        while(!input[j].isLetterOrDigit()  && j > i){
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
    val s1 = SavingsAccount("S1", 1000.0)
    s1.deposit(1000.0)
    val s2 = CheckingAccount("S2", 2000.0)
    s2.deposit(1000.0)
    val accounts: List<BankAccount> = listOf(
        s1, s2
    )

    for (account in accounts){
        account.printDetails()
        if(account is InterestBearing){
            println(account.calculateInterest())
        }
    }
}