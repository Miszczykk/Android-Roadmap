package week2

class SavingsAccount(accountNumber: String, balance: Double) : BankAccount(accountNumber, balance), InterestBearing {
    override fun calculateInterest(): Double {
        return balance * 0.05
    }

    override fun printDetails() {
        println("Savings account")
        println("account: $accountNumber")
        println("balance: $balance")
    }
}