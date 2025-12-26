package week3

fun main(){
    val score = 100

    if(score >= 90){
        println("Mark: A (Excellent)")
    }else if(score >= 75){
        println("Mark: B (Good)")
    }else if(score >= 50){
        println("Mark: C (Satisfactory)")
    }else{
        println("Mark: F (Failing)")
    }
}