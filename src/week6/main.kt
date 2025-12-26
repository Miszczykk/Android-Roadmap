package week6

fun isContentSafe(message: String): Boolean {
    return !message.contains("shit")
}

fun main(){
    if(isContentSafe("My message")){
        println("Published")
    }else{
        println("Message rejected by the filter")
    }
}