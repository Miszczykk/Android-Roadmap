package week2_2

class zadanie1{
    fun menu(){
        println("1-dodawanie")
        println("2-odejmowanie")
        println("3-dzielenie")
        println("4-mnozenie")
        println("5-modulo")
        var wybor: Int?
        do{
            print("Podaj nr: ")
            wybor = readln().toIntOrNull() ?: 1
        }while(wybor !in 1..5)

        when(wybor){
            1 -> dodawanie()
            2 -> odejmowanie()
            3 -> dzielenie()
            4 -> mnozenie()
            5 -> modulo()
        }
    }

    fun dodawanie(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("$a + $b = ${a+b}")
    }

    fun odejmowanie(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("$a - $b = ${a-b}")
    }

    fun dzielenie(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        if(b != 0.0){
            println("$a / $b = ${a/b}")
        }
    }

    fun mnozenie(){
        print("Podaj a: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Podaj b: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("$a * $b = ${a*b}")
    }

    fun modulo(){
        print("Podaj a: ")
        val a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        val b = readln().toIntOrNull() ?: 0
        if(b != 0){
            println("$a % $b = ${a%b}")
        }
    }
}

class zadanie2{
    fun zadanie(){
        print("Podaj a: ")
        val a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        val b = readln().toIntOrNull() ?: 0
        when{
            a > 0 -> println("$a jest dodatnie")
            a == 0 -> println("$a jest równe zero")
            else -> println("$a jest ujemne")
        }

        when{
            b > 0 -> println("$b jest dodatnie")
            b == 0 -> println("$b jest równe zero")
            else -> println("$b jest ujemne")
        }

        when{
            a % 2 == 0 -> println("$a jest parzyste")
            else -> println("$a jest nieparzyste")
        }

        when{
            b % 2 == 0 -> println("$b jest parzyste")
            else -> println("$b jest nieparzyste")
        }
    }
}

class zadanie3{
    fun zadanie(){
        print("Podaj a: ")
        val a = readln().toUIntOrNull() ?: 0u
        print("Podaj b: ")
        val b = readln().toUIntOrNull() ?: 0u
        print("Podaj c: ")
        val c = readln().toUIntOrNull() ?: 0u
        var max: UInt
        if(a > b){
            if(a > c){
                max = a
                println("Czy da się zbudować trójkąt: ${max < (b+c)}")
            }else{
                max = c
                println("Czy da się zbudować trójkąt: ${max < (b+a)}")
            }
        }else{
            if(b > c){
                max = b
                println("Czy da się zbudować trójkąt: ${max < (a+c)}")
            }else{
                max = c
                println("Czy da się zbudować trójkąt: ${max < (b+a)}")
            }
        }
        println("Największa to: $max")
    }
}

class zadanie4{
    fun zadanie(){
        var a: Int?
        val tablicaDni = listOf<String>("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
        do{
            print("Podaj a: ")
            a = readln().toIntOrNull() ?: 0
        }while(a !in 1..7)
        print("${tablicaDni[a-1]}, do weekendu pozostało: ")

        for(i in a-1..4){
            print("${tablicaDni[i]}, ")
        }

        if(a in 6..7){
            print("już trwa weekend")
        }
    }
}
fun main(){
    zadanie1().menu()
    zadanie2().zadanie()
    zadanie3().zadanie()
    zadanie4().zadanie()
}