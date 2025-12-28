package week9

open class Employee(val name: String, val salary: Int){
    fun work(){
        println("$name working...")
    }
}
class Developer(name: String, salary: Int) : Employee(name, salary){
    fun code(){
        println("$name coding in Kotlin.")
    }
}
class Manager(name: String, salary: Int) : Employee(name, salary){
    fun conductMeeting(){
        println("$name leads the meeting.")
    }
}

fun main(){
    val developer = Developer("Milosz", 10000)
    val manager = Manager("Elon", 50000)
    developer.work()
    developer.code()
    manager.work()
    manager.conductMeeting()
}