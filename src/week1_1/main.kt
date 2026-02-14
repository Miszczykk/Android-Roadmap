package week1_1
const val PI = 3.1415

fun zad2(){
    println("Podaj promień: ")
    val r = readln().toDoubleOrNull() ?: 0.0
    val A = PI * r * r
    val Obw = 2 * PI * r
    val Pow = 4 * PI * r * r
    val V = 4/3 * PI * r * r * r
    println("Pole koła: $A")
    println("Obwód koła: $Obw")
    println("Powierzchnia kuli: $Pow")
    println("Objętość kuli: $V")
}

class zad4{
    fun Roznice(){
        print("Podaj a: ")
        val a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        val b = readln().toIntOrNull() ?: 0
        println("$a - $b = ${a-b}")
        println("$b - $a = ${b-a}")
    }

    fun Iloczyn(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("$a * $b = ${a*b}")
    }

    fun Iloraz(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        if(b != 0.0){
            println("$a / $b = ${a/b}")
        }

        if(a != 0.0){
            println("$b / $a = ${b/a}")
        }
    }

    fun Iloraz2(){
        print("Podaj a: ")
        val a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        val b = readln().toIntOrNull() ?: 0
        if(b != 0){
            println("$a / $b = ${a/b}")
        }

        if(a != 0){
            println("$b / $a = ${b/a}")
        }
    }

    fun Reszta(){
        print("Podaj a: ")
        val a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        val b = readln().toIntOrNull() ?: 0
        if(b != 0){
            println("$a % $b = ${a%b}")
        }
    }

    fun CaleNaCentymetry(){
        print("Podaj cale: ")
        val a = readln().toDoubleOrNull() ?: 0.0

        println("Cale na Centymetry: ${a * 2.54}")
    }

    fun PLNnaUSD(){
        print("Podaj PLN: ")
        val pln = readln().toDoubleOrNull() ?: 0.0
        println("PLN na USD: ${pln * 0.28}")
    }

    fun CelsjuszNaFahrenheit(){
        print("Podaj c: ")
        val c = readln().toDoubleOrNull() ?: 0.0
        println("Celsjusz na Fahrenheit: ${(c * 9/5) + 32}")
    }

    fun LitryNaGalony(){
        print("Podaj l: ")
        val l = readln().toDoubleOrNull() ?: 0.0
        println("LitryNa galony: ${l * 0.264172052}")
    }

    fun kgNaFunty(){
        print("Podaj kg: ")
        val kg = readln().toDoubleOrNull() ?: 0.0
        println("Kg na funty to: ${kg * 2.20462262}")
    }
}

fun main(){

}