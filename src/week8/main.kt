package week8

class User(val firstName: String, val middleName: String?, val lastName: String){
    fun printFullName(){
        println("$firstName (${middleName?: "-"}) $lastName")
    }
}
fun main(){
    val user1 = User("Anna", "Maria", "Nowak")
    val user2 = User("Tomasz", null, "Wójcik")
    user1.printFullName()
    user2.printFullName()
}