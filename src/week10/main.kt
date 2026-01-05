package week10

open class Payment(val amount: Double){
    open fun process(){
        println("On-site payment processing $amount...")
    }
}

class CreditCardPayment(amount: Double, val cardNumber: String): Payment(amount){
    override fun process(){
        super.process()
        println("Authorization for card $cardNumber completed.")
    }
}

class PayPalPayment(amount: Double, val email: String): Payment(amount){
    override fun process(){
        println("Logging in to PayPal $email for amount $amount... Success")
    }
}

fun main(){
    val objectCreditCard = CreditCardPayment(100.0, "1234-5678")
    val objectPayPal = PayPalPayment(50.0, "jan@email.com")

    objectCreditCard.process()
    objectPayPal.process()
}