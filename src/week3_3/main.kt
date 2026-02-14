package week3_3

class zadanie1{
    fun pobierz(){
        var x: Int?
        var y: Int?
        do{
            print("Podaj x: ")
            x = readln().toIntOrNull() ?: 0
            print("Podaj y: ")
            y = readln().toIntOrNull() ?: 0
        }while(x !in 1..30 || y !in 1..30)

        wyswietl(x,y)
    }

    fun wyswietl(x: Int, y: Int){
        for(i in 0..<y){
            for(j in 0..<x){
                print("#")
            }
            print("\n")
        }
    }
}

class zadanie2{
    fun pobierz(){
        var n: Int?
        do{
            print("Podaj n: ")
            n = readln().toIntOrNull() ?: 0
        }while(n <= 0)
        wypelnij(n)
    }

    fun wypelnij(n: Int){
        var suma: Double = 0.0
        var iloscPoprawnych: Int = 0
        var iloscNiepoprawnych: Int = 0
        var i: Int = 0
        while(i < n){
            var wartosc: Double?
            do{
                print("Podaj wartosc: ")
                wartosc = readln().toDoubleOrNull() ?: 0.0
                iloscNiepoprawnych++
            }while(wartosc <= 0.0)
            iloscNiepoprawnych--
            iloscPoprawnych++
            i++
            suma += wartosc
        }

        wyswietl(iloscPoprawnych, iloscNiepoprawnych, suma, n)
    }

    fun wyswietl(poprawne: Int, niepoprawne: Int, suma: Double, n: Int){
        println("Średnia wynosi: ${suma/n}")
        println("Ilość podanych liczb: ${poprawne+niepoprawne}")
        println("Ilość niepoprawnych liczb: $niepoprawne")
        println("Ilość poprawnych liczb: $poprawne")
        println("Suma wynosi: $suma")
    }
}

class zadanie3{
    var a: UInt = 0u
    var b: UInt = 0u
    var c: UInt = 0u

    fun pobierz(){
        print("Podaj a: ")
        a = readln().toUIntOrNull() ?: 0u

        do{
            print("Podaj b: ")
            b = readln().toUIntOrNull() ?: 0u
        }while(b <= a)

        do{
            print("Podaj c: ")
            c = readln().toUIntOrNull() ?: 0u
        }while(c == 0U)
        z1(a,b)
        z2(a,b)
        z3(a,b)
        z4(a,b, c)
    }

    fun z1(a: UInt, b: UInt){
        for(i in a..b){
            if((i % 2U).toInt() == 0){
                println(i)
            }
        }
    }

    fun z2(a: UInt, b: UInt){
        for(i in a..b){
            if((i % 2U).toInt() != 0){
                println(i)
            }
        }
    }

    fun z3(a: UInt, b: UInt){
        var suma: Int = 0
        for(i in a..b){
            suma += i.toInt()
        }
        println(suma)
    }

    fun z4(a: UInt, b: UInt, c: UInt){
        var suma: Int = 0
        for(i in a..b){
            if((i % c).toInt() == 0){
                println(i)
                suma+= i.toInt()
            }
        }
        println("Suma: $suma")
        println("Średnia: ${suma/(b-a).toInt()}")
    }

}

fun main(){
    zadanie3().pobierz()
}