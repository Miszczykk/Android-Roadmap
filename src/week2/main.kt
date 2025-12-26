package week2

fun main(){
    val userAge = 16
    val limit = 18
    if(userAge >= limit){
        println("Access granted. We invite you to shop.")
    }else{
        println("Access denied. Please come back when you're done " + limit + " age.")
    }
}