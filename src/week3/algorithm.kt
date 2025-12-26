package week3

fun main(){
    val passwordLength = 10
    val hasSpecialChar = true
    if(passwordLength >= 8 && hasSpecialChar){
        println("Password is strong")
    }else{
        println("Password is weak")
    }
}