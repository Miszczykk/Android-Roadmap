package week2

abstract class BankAccount(val accountNumber:String, var balance:Double) {
    fun deposit(amount:Double){
        balance += amount
    }
    open fun withdraw(amount:Double): Boolean{
        if(amount <= 0){
            return false
        }
        if(amount <= balance){
            balance -= amount
            return true
        }
        return false
    }
    abstract fun printDetails()
}