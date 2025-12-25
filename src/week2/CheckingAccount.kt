package week2

class CheckingAccount(accountNumber: String, balance: Double) : BankAccount(accountNumber, balance) {
    override fun withdraw(amount: Double): Boolean{
        if(balance - amount >= -1000.0){
            balance -= amount
            return true
        }
        return false
    }

    override fun printDetails() {
        println("Checking account")
        println("account: $accountNumber")
        println("balance: $balance")
    }
}