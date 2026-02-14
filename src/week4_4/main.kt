package week4_4

fun liczbaPierwsza(){
    var n: Int
    var pierwsza: Boolean
    do{
        print("Podaj liczbe: ")
        n = readln().toIntOrNull() ?: 0
    }while(n <= 0)

    if(n > 1){
        pierwsza = true
    }else{
        pierwsza = false
    }

    var d = 2
    while(pierwsza && d*d <= n){
        if(n % d == 0){
            pierwsza = false
        }else{
            d++
        }
    }

    if(pierwsza){
        println("TAK")
    }else{
        println("NIE")
    }
}

fun dzielnikiLiczby(){
    var n: Int
    do{
        print("Podaj liczbe: ")
        n = readln().toIntOrNull() ?: 0
    }while(n <= 0)

    var i = 1

    while(i * i < n){
        if(n % i == 0){
            println(i)
            println(n/i)
        }
        i++
    }

    if(i*i == n){
        println(i)
    }
}


fun prostokat(){
    print("Podaj x: ")
    val x = readln().toIntOrNull() ?: 0

    print("Podaj y: ")
    val y = readln().toIntOrNull() ?: 0

    for(i in 0..<y){
        for(j in 0..<x){
            if(i == 0 || i == x-1){
                print("*")
            }else{
                if(j == 0 || j == y-1){
                    print("*")
                }else{
                    print(" ")
                }
            }
        }
        print("\n")
    }
}

fun trojkat(){

    var x: Int
    do{
        print("Podaj x: ")
        x = readln().toIntOrNull() ?: 0
    }while(x % 2 == 0 || x <= 0)

    val y = (x / 2) + 1 // 4

    for (i in 0..<y){
        for(j in 0..<x){
            if(i == 0){
                if(j == y-1){
                    print("*")
                }else{
                    print(" ")
                }
            }else if(i == y-1){
                print("*")
            }else{
                if(j==y-i-1 || j == y + i - 1){
                    print("*")
                }else{
                    print(" ")
                }
            }
        }
        print("\n")
    }
}

fun nwd(){
    var a: Int
    var b: Int

    do{
        print("Podaj a: ")
        a = readln().toIntOrNull() ?: 0
        print("Podaj b: ")
        b = readln().toIntOrNull() ?: 0
    }while(a <= 0 || b <= 0)

    while(a != b){
        if(a > b) a -= b
        else b -= a
    }
    print(a)
}

fun main(){
//    liczbaPierwsza()
//    dzielnikiLiczby()
//    prostokat()
//    trojkat()
    nwd()
}