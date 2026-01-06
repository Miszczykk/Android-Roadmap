package week11

interface MathOperation{
    fun execute(a: Int, b: Int): Int
}

class Addition: MathOperation{
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}

class Subtraction: MathOperation{
    override fun execute(a: Int, b: Int): Int {
        return a - b
    }
}

fun main(){
    val operations = listOf(Addition(), Subtraction())
    for(operation in operations){
        println(operation.execute(10,5))
    }
}