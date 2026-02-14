package week5_5

import kotlin.math.abs

fun figura(){
    println("1. kwadrat")
    println("2. prostokąt")
    println("3. trójkąt")
    println("4. trapez")
    print("Podaj co obliczyć: ")

    when(readln().toIntOrNull() ?: 0){
        1 -> kwadrat()
        2 -> prostokat()
        3 -> trojkat()
        4 -> trapez()
        else -> println("Bledne")
    }
}

fun kwadrat(){
    println("1. Pole")
    println("2. Obwód")
    print("Podaj co obliczyć: ")
    when(readln().toIntOrNull() ?: 0){
        1 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${a*a}")
        }
        2 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            println("Obwód: ${4*a}")
        }
        else -> println("Bledne")
    }
}

fun prostokat(){
    println("1. Pole")
    println("2. Obwód")
    print("Podaj co obliczyć: ")
    when(readln().toIntOrNull() ?: 0){
        1 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj b: ")
            val b = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${a*b}")
        }
        2 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj b: ")
            val b = readln().toDoubleOrNull() ?: 0.0
            println("Obwód: ${2 * a + 2 * b}")
        }
        else -> println("Bledne")
    }
}

fun trojkat(){
    println("1. Pole")
    println("2. Obwód")
    print("Podaj co obliczyć: ")
    when(readln().toIntOrNull() ?: 0){
        1 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj h: ")
            val h = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${(a*h) / 2}")
        }
        2 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj b: ")
            val b = readln().toDoubleOrNull() ?: 0.0
            print("Podaj c: ")
            val c = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${a+b+c}")
        }
        else -> println("Bledne")
    }
}

fun trapez(){
    println("1. Pole")
    println("2. Obwód")
    print("Podaj co obliczyć: ")
    when(readln().toIntOrNull() ?: 0){
        1 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj b: ")
            val b = readln().toDoubleOrNull() ?: 0.0
            print("Podaj h: ")
            val h = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${((a+b) * h) / 2}")
        }
        2 -> {
            print("Podaj a: ")
            val a = readln().toDoubleOrNull() ?: 0.0
            print("Podaj b: ")
            val b = readln().toDoubleOrNull() ?: 0.0
            print("Podaj c: ")
            val c = readln().toDoubleOrNull() ?: 0.0
            print("Podaj d: ")
            val d = readln().toDoubleOrNull() ?: 0.0
            println("Pole: ${a+b+c+d}")
        }
        else -> println("Bledne")
    }
}

fun f_suma(w1: UInt){

    var suma = 0
    var licznik = 0
    while(suma <= w1.toInt()){
        print("Podaj liczbe: ")
        val liczba = readln().toIntOrNull() ?: 0
        suma += liczba
        licznik++
    }
    println("Suma: $suma")
    println("Licznik: $licznik")
    println("Średnia: ${suma/licznik}")
}

fun fun1(zm1: Double, zm2: Double, zm3: Double){
    println(zm1+zm2+zm3)
}

fun fun1(zm1: Int, zm2: Int, zm3: Int){
    println(zm1+zm2+zm3)
}

fun potega(a: Int, b: Int, c: Int = 0): Int{
    when(c){
        0 -> return szybkiePotegowanie(a, b)
        1 -> return 2 * b
        2 -> return szybkiePotegowanie(abs(a), abs(b))
        else -> return -1
    }
}

fun szybkiePotegowanie(x: Int, n: Int): Int{
    if(n == 0){
        return 1
    }
    if(n % 2 == 0){
        return szybkiePotegowanie(x,n/2) * szybkiePotegowanie(x,n/2)
    }else{
        return x * szybkiePotegowanie(x,(n-1)/2) * szybkiePotegowanie(x,(n-1)/2)
    }
}

fun oblicz(a: Int, b: Int): Int{
    var zm1 = a
    var zm2 = b
    while(zm1 != zm2){
        if(zm1 > zm2) zm1-=zm2
        else zm2-= zm1
    }
    return zm1
}

fun oblicz(a: Int, b: Int, c: Int): Int{
    if(a+b > c && b+c > a && a+c > b){
        return 1
    }else{
        return 0
    }
}

fun main(){
    figura()
    f_suma(10U)
    fun1(5.5, 2.5, 3.0)
    fun1(2,3,4)
    println(potega(2,3))
    println(oblicz(5,10,2))
}