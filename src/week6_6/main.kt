package week6_6
const val ILOSC_ELEMENTOW = 10
class zad{

    data class PolaczeniaAutobusowe(val ID: Int, var miastoDocelowe: String, var dlugosc_trasy: UInt, var godzina_odjazdu: Double, var cena_biletu: Double)

    val tab = arrayOfNulls<PolaczeniaAutobusowe>(ILOSC_ELEMENTOW)

    fun WybranyElement(){
        var IDpodane: Int
        var element = -1

        do{
            print("Podaj ID: ")
            IDpodane = readln().toIntOrNull() ?: 0
            for(i in 0..<ILOSC_ELEMENTOW){
                if(tab[i]!!.ID == IDpodane){
                    element = i
                }
            }
        }while(element == -1)
        println("[${tab[element]!!.ID}, ${tab[element]!!.miastoDocelowe}, ${tab[element]!!.dlugosc_trasy}, ${tab[element]!!.godzina_odjazdu}, ${tab[element]!!.cena_biletu} zł]")
    }

    fun SredniaCenaBiletu(){
        var licznikTras = 0
        var sumaCen = 0.0

        for(i in 0..<ILOSC_ELEMENTOW){
            if(tab[i]!!.dlugosc_trasy < 10U){
                sumaCen += tab[i]!!.cena_biletu
                licznikTras++
            }
        }

        if(licznikTras != 0){
            println("Średnia cena biletu dla tras krótszych niż 10 km to: ${sumaCen/licznikTras} zł")
        }else{
            println("Brak tras poniżej 10 km")
        }
    }

    fun NajdluzszaTrasa(){
        var najdluzsza = 0
        for(i in 0..<ILOSC_ELEMENTOW){
            if(tab[i]!!.dlugosc_trasy > tab[najdluzsza]!!.dlugosc_trasy){
                najdluzsza = i
            }
        }
        println("Najdłuższa trasa to: ${tab[najdluzsza]!!.dlugosc_trasy} km")
    }

    fun WszystkieElementy(){
        for(i in 0..<ILOSC_ELEMENTOW){
            println("$i. [${tab[i]!!.ID}, ${tab[i]!!.miastoDocelowe}, ${tab[i]!!.dlugosc_trasy}, ${tab[i]!!.godzina_odjazdu}, ${tab[i]!!.cena_biletu} zł]")
        }
    }

    fun ZmianaDanych(){
        var IDpodane: Int
        var element = -1
        do{
            print("Podaj ID: ")
            IDpodane = readln().toIntOrNull() ?: 0
            for(i in 0..<ILOSC_ELEMENTOW){
                if(tab[i]!!.ID == IDpodane){
                    element = i
                }
            }
        }while(element == -1)

        print("Podaj nowe miasto docelowe: ")
        tab[element]!!.miastoDocelowe = readln()

        print("Podaj nową długość trasy: ")
        tab[element]!!.dlugosc_trasy = (readln().toUIntOrNull() ?: 0.0) as UInt

        print("Podaj nową godzinę odjazdu: ")
        tab[element]!!.godzina_odjazdu = readln().toDoubleOrNull() ?: 0.0

        print("Podaj nową cenę biletu: ")
        tab[element]!!.cena_biletu = readln().toDoubleOrNull() ?: 0.0
    }

    fun uzupelnienieDanych(){
        val tabID = intArrayOf(2335, 3742, 4540, 4673, 4944, 6525, 7211, 7659, 8667, 8806 )
        val tabMiastoDocelowe = arrayOf("Kołczewo", "Wisełka", "Międzyzdroje", "Świnoujście", "Wolin", "Międzywodzie", "Kamień Pomorski", "Unin", "Łuskowo", "Goleniów")
        val tabDlugoscTrasy = arrayOf(209U, 164U, 239U, 4U, 247U, 150U, 288U, 142U, 185U, 19U)
        val tabGodzinaOdjazdu = arrayOf(04.15, 19.42, 08.09, 23.51, 12.30, 01.27, 16.05, 10.18, 06.55, 21.33)
        val tabCenaBiletu = arrayOf(128.64, 194.31, 176.84, 187.55, 81.12, 116.11, 143.35, 52.58, 195.25, 132.54)

        for(i in 0..<ILOSC_ELEMENTOW){
            tab[i] = PolaczeniaAutobusowe(tabID[i], tabMiastoDocelowe[i], tabDlugoscTrasy[i], tabGodzinaOdjazdu[i], tabCenaBiletu[i])
        }
    }

    fun Menu(){
        println("MENU:")
        println("1. Wyświetl wybrany element (ID)")
        println("2. Zmień wybrany element (ID)")
        println("3. Wyświetl wszystkie lementy")
        println("4. Wyświetl średnią cenę biletu dla tras krótszej niż 10 km/h")
        println("5. Uzupełnij dane")
        println("6. Wyświetl najdłuższą trasę")
        println("7. Exit")
        print("Twój wybór: ")
        when(readln().toIntOrNull() ?: 0){
            1 -> WybranyElement()
            2 -> ZmianaDanych()
            3 -> WszystkieElementy()
            4 -> SredniaCenaBiletu()
            5 -> uzupelnienieDanych()
            6 -> NajdluzszaTrasa()
        }
    }
}

fun main(){
    var obiekt = zad()
    obiekt.uzupelnienieDanych()

    obiekt.Menu()
}