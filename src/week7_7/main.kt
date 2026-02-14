package week7_7

import java.io.File

fun main(){
    val plik = File("src/week7_7/dzialania.txt")
    plik.forEachLine { linia ->
        val czesc = linia.split(" ")
        val zm1 = czesc[0].toDouble()
        val znak = czesc[1].first()
        val zm2 = czesc[2].toDouble()
        var suma = 0.0
        when(znak){
            '+' -> suma = zm1 + zm2
            '-' -> suma = zm1 - zm2
            '*' -> suma = zm1 * zm2
            '/' -> {
                if(zm2 != 0.0){
                    suma = zm1 / zm2
                }else{
                    suma = Double.NaN
                }
            }
            '%' -> {
                if(zm2 != 0.0){
                    suma = (zm1.toInt() % zm2.toInt()).toDouble()
                }else{
                    suma = Double.NaN
                }
            }
            else -> suma = Double.NaN
        }
        val nowyPlik = File("src/week7_7/wyniki.txt")
        if(!suma.isNaN()){
            nowyPlik.appendText("$zm1 $znak $zm2 = $suma\n")
        }else{
            nowyPlik.appendText("$zm1 $znak $zm2 = Błąd\n")
        }

    }
}