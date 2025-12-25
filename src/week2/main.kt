import week2.BankAccount
import week2.CheckingAccount
import week2.InterestBearing
import week2.SavingsAccount

fun main(){
    val accounts: List<BankAccount> = listOf(
        SavingsAccount("OSZCZ-001", 5000.0),
        CheckingAccount("ROR-001", 200.0),
        SavingsAccount("OSZCZ-002", 10000.0),
        CheckingAccount("ROR-002", -500.0)
    )

    for (account in accounts){
        account.printDetails()
        if(account is InterestBearing){
            println(account.calculateInterest())
        }
    }
}