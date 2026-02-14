# Tydzień 1

`val` - gdy tworzymy stałą, musimy jej nadać wartość początkową, która przez cały okres działania programu nie zmieni swojej wartości

`var` - do zmiennych, która wartość będzie się zmieniać w czasie działania programu

`print()` - służy do wypisania tekstu

`println()` - to samo co print(), lecz dodaje podział wiersza **\n**

```kotlin
val imie = "Ala"
println("$imie ma kota.")
//druga wersja:
println(imie + " ma kota.")
```

**Typy zmiennych (podstawowe):**
* `String` - do przechowywania tekstu
* `Char` - do przechowywania znaku
* `Int` - zmienna typu integer, która będzie przechowywać wartości liczbowe całkowite
* `Double` - zmienna typu rzeczywistego, która będzie przechowywać wartości liczbowe zmiennoprzecinkowe 
* `Boolean` - do przechowywania dwóch wartości **true** lub **false**


**Konwencja pisania nazw zmiennych:**
* Powinna mieć charakter wystarczająco opisowy, aby przekazać ich cel bez dodatkowych komentarzy
* Pierwszy znak powinien być pisany małą literą, natomiast kolejne słowo zaczynać się od wielkiej litery (konwencja camelCase)
* Unikaj skrótów oraz nazw jednoliterowych
* Podczas nazywania tablic lub słowników używaj nazw w liczbie mnogiej
* Do typu *Boolean* używaj prefiksów `is`, `has`, `can` lub `should`
* Do pisania zmiennych stałych (`const val`) wszystkie znaki powinny być pisane z dużych liter

```kotlin
val userFirstName: String = "Milosz"
val userAge: Int = 21
val hobbies = arrayOf("Skiing", "Driving", "Swimming")
val isStudent: Boolean = true
const val USER_PESEL: Long = 12345678901L
```

**Operatory arytmetyczne:**
* `+` - dodawanie *2 + 2 = 4*
* `-` - odejmowanie *4 - 2 = 2*
* `*` - mnożenie *2 * 3 = 6*
* `/` - dzielenie *6 / 2 = 3*
* `%` - reszta z dzielenia *(modulo)* *3 % 2 = 1*


**Operatory inkrementacji i dekrementacji:**
* `postdekrementacja (postfix)` - **x--**
* `predekrementacja (prefix)` - **--x**
* `postinkrementacja (postfix)` - **x++**
* `preinkrementacja (prefix)` - **++x**

Operator **inkrementacji** to operator zwiększenia wartości zmiennej o 1

Operator **dekrementacji** to operator zmniejszenia wartości zmiennej o 1

**pre** - najpierw zmieniamy wartość zmiennej, a później wykonujemy na niej działanie

**post** - najpierw wykonujemy na niej działanie, a później zmieniamy wartość zmiennej


# Tydzień 2 i 3

`if` - sprawdza, czy warunek jest spełniony, jeżeli tak, to instrukcja się wykonuje

`else if` - jeżeli warunek if jest niespełniony, to sprawdza następne warunki

`else` - jeżeli wszystkie poprzednie warunki są niespełnione, to wykonuje to

```kotlin
val firstValue = 10
val secondValue = 5

if (firstValue > secondValue) {
    print("$firstValue jest większe od $secondValue")
} else if (firstValue == secondValue) {
    print("$firstValue jest równe $secondValue")
} else {
    print("$firstValue jest mniejsze od $secondValue")
}
```

# Tydzień 4

* `arrayOf()`
  * Rozmiar jest stały
  * Można modyfikować wartości elementów
  * Swobodny dostęp do dowolnego elementu za sprawą indeksów
  * Zajmują ciągły obszar pamięci (referencje)
  * tablica w Kotlinie to **klasa** (Array)
  * Istnieją wersje dla typów prostych (`intArrayOf`), które są lżejsze dla pamięci
```kotlin
val cars = arrayOf("Audi", "BMW", "Mercedes-Benz", "Ferrari")

for(car in cars){
    println(car)
}
```
* `listOf()`
  * Rozmiar jest stały
  * Nie można modyfikować wartości elementów
  * Swobodny dostęp do dowolnego elementu za sprawą indeksów
  * Operacje zmieniające (np. list+1) - tworzą nową, niezależną listę i kopiują całą zawartość starej listy
```kotlin
val cars = listOf("Audi", "BMW", "Mercedes-Benz", "Ferrari")

for(car in cars){
    println(car)
}
```
* `mutableListOf()`
  * Rozmiar jest skalowalny - możemy dodawać i usuwać elementy
  * Można modyfikować wartości elementów
  * Swobodny dostęp do dowolnego elementu za sprawą indeksów
  * Dodawanie elementów jest zwykle szybkie (z powodu, że używa tablicy z zapasem miejsca), lecz gdy brakuje miejsca, musi znaleźć nowy, większy obszar, skopiować tam wszystkie dane i usunąć stare, co jest operacją czasochłonną
```kotlin
val cars = mutableListOf("Audi", "BMW", "Mercedes-Benz", "Ferrari")

for(car in cars){
    println(car)
}
```



# Tydzień 5
`for ({pole1} in {pole2} {pole3})` - używamy tej pętli, gdy znamy ilość iteracji.

* `pole1` - inicjalizacja pętli, w tym miejscu tworzymy zmienną, która jest tylko do odczytu **val**
* `pole2` - warunek pętli. Warunek jest sprawdzany przed uruchomieniem pętli. Jeżeli warunek jest prawdziwa to pętla się uruchomi. Pole to uruchamiane jest na początku każdej pętli. Przykład użycia:
  * `0..5` - zakres w tym przypadku jest <0 ; 5>
  * `0..<5` - zakres w tym przypadku jest <0 ; 5)
  * `0 until 5` - zakres w tym przypadku jest <0 ; 5)
  * `5 downTo 0` - zakres w tym przypadku jest <0 ; 5>, lecz wykonuje od końca, czyli od większej wartości
* `pole3` - krok pętli. Po zakończeniu każdego przebiegu pętli komenda w tym polu jest uruchamiana. W tym polu zmieniana jest wartość zmiennej odpowiadającej za warunek pętli. Pole wykonuje się jako ostatnie. Nie jest obowiązkowe, gdy tego pola nie napiszemy domyślnie, będzie zmieniać o 1 w górę (chyba, że w polu2 zainicjalizowaliśmy `downTo` to wtedy o 1 w dół). Należy pamiętać, że wartość musi być liczbą dodatnią.
  * `step 2`

```kotlin
for(i in 0..10 step 2){
    println(i)
}
```

# Tydzień 6

`fun main()` - jest to funkcja główna, wymagana w każdym programie Kotlin. Jest to punkt wejścia lub punkt wyjścia programu.

* **Zalety funkcji:**
  * Pozwala na podzielenie go na mniejsze, łatwiejsze w zarządzaniu części
  * Możliwość ponownego użycia
* **Wady funkcji:**
  * Mogą zwiększyć rozmiar kodu i ilość pamięci potrzebnej do jego wykonania, jeśli masz wiele funkcji
  * Mogą utrudniać debugowanie, jeśli wewnątrz funkcji znajduje się złożona logika, zwłaszcza jeśli wiele funkcji wywołuje się wzajemnie

`fun nazwaFunkcji(nazwaArgumentu: typArgumentu, ...): typZwrotu`

typZwrotu - gdy chcemy. aby funkcja coś zwracała to w tej części deklarujemy jaki typ ma zwracać, natomiast gdy nie chcemy aby coś zwracała to zostawiamy to pole puste.

```kotlin
fun dodaj(pierwszaZmienna: Int, drugaZmienna: Int): Int{
    return pierwszaZmienna + drugaZmienna
}

fun main(){
    val suma = dodaj(5, 2)
    println(suma)
}
```

# Tydzień 7

***Klasa*** - to plan tworzenia obiektów, dostarczania wartości początkowych dla stanu oraz implementacji zachowań.

***Obiekt*** - jest to instancja klasy, ma własny stan i zachowanie. Można utworzyć wiele obiektów z tej samej klasy, każdy z własnym unikalnym stanem.

**Konwencja pisania nazw klas:**
* Pierwszy znak powinien być pisany dużą literą oraz kolejne słowa zaczynać się od wielkiej litery (konwencja PascalCase)
* Nazwa powinna być rzeczownikiem

```kotlin
class Samochod(val marka: String, val model: String, val rocznik: Int, var licznik: Int) {
    
    fun zwiekszLicznik(oIleZwiekszyc: Int) {
        if(oIleZwiekszyc > 0) {
            licznik += oIleZwiekszyc
        }
    }
}
fun main(){
    val mojSamochod = Samochod("OPEL", "Insignia", 2013, 200_000)

    mojSamochod.zwiekszLicznik(600)
    print(mojSamochod.licznik)
}
```

# Tydzień 8

Kiedy Kotlin może zgłosić wyjątek NullPointerException?
* Gdy jawnie rzucisz NullPointerException()
* Jeśli używasz `!!` operator zmiennej, która okazuje się być nullem
* Jeśli próbujesz użyć obiektu przed jego prawidłową inicjalizacją

Aby dopuścić aby zmienna zawierała wartość null, musisz po typie dać `?`

```kotlin
fun suma(a: Int?, b: Int?): Int{
    return (a ?: 0) + (b ?: 0)
}

fun main(){
    print(suma(10, null)) //10 + 0 = 10
}
```

# Tydzień 9

Dziedziczenie umożliwia ponownie wykorzystanie kodu, pozwala na dziedziczenie wszystkich funkcji z istniejącej klasy bazowej przez nową klasę pochodną. Ponadto klasa pochodna może również dodać pewne własne funkcje.

* Klasa bazowa:
  * Zawiera cechy i zachowania, które można zastąpić w klasie pochodnej
  * Stanowią przewodnik, który można wykorzystać do opracowania bardziej szczegółowych zajęć przedmiotowych
* Klasa pochodna:
  * Dziedziczy właściwości i funkcje z klasy bazowej
  * Może tworzyć dodatkowe właściwości i funkcje, które są specyficzne dla klasy pochodnej

```kotlin
open class Pracownik(val imie: String, var zarobki: Int?){
    fun dajAwans(){
        zarobki = (zarobki ?: 0) + 1000
        println(zarobki)
    }
}

class Programista(imie: String, zarobki: Int?) : Pracownik(imie, zarobki){
    fun piszKod(){
        println("$imie pisze kod")
    }
}

fun main(){
    val programista = Programista("Milosz", 1000)
    programista.dajAwans()
    programista.piszKod()
}
```

# Tydzień 10

Polimorfyzm pozwala traktować obiekty różnych klas w ten sam sposób, przez wspólną klasę bazową, ale sprawia, że wykonują one zadania w różny specyficzny dla siebie sposób.

```kotlin
open class Pracownik(val imie: String, var zarobki: Int?){
    open fun dajAwans(){
        zarobki = (zarobki ?: 0) + 1000
        println(zarobki)
    }
}

class Programista(imie: String, zarobki: Int?) : Pracownik(imie, zarobki){
    override fun dajAwans(){
        zarobki = (zarobki ?: 0) + 5000
        println(zarobki)
    }
}

fun main(){
    val programista = Programista("Milosz", 1000)
    programista.dajAwans()
}
```

# Tydzień 11

Interfejs to typ niestandardowy, którego nie można utworzyć samodzielnie. Może zawierać:
* Metody abstrakcyjne
* Deklaracje metod z domyślnymi implementacjami
* Deklaracje właściwości
* Wartości domyślne parametrów metody

```kotlin
interface Operacja{
    fun oblicz(pierwszaZmienna: Int, drugaZmienna: Int): Int
}

class Dodawanie: Operacja{
    override fun oblicz(pierwszaZmienna: Int, drugaZmienna: Int): Int{
        return pierwszaZmienna + drugaZmienna
    }
}

fun main(){
    val operacja = Dodawanie()
    val suma = operacja.oblicz(10, 2)
    print(suma)
}
```

# Tydzień 12

`enum` - wyliczenia to lista nazwanych stałych. Są w rzeczywistości klasami. Oznacza to, że mogą mieć właściwości, metody, a nawet konstruktory.

```kotlin
enum class Day {
    PONIEDZIALEK,
    WTOREK,
    SRODA,
    CZWARTEK,
    PIATEK,
    SOBOTA,
    NIEDZIELA
}

fun main(){
    for(day in Day.entries){
        println(day)
    }
}
```

`data class` - jest to klasa przechowująca dane. Aby mieć pewność, że klasa danych działają prawidłowo, Kotlin ma kilka reguł:
* Konstruktor podstawowy musi mieć co najmniej jeden argument
* Wszystkie podstawowe argumenty konstruktora muszą być oznaczone val lub var
* Klasa danych nie może być abstrakcyjna, otwarta, zapieczętowana ani wewnętrzna
* Klasa danych może jedynie implementować interfejsy, czyli nie może być dziedziczona, ale sama może dziedziczyć po innych klasach

```kotlin
data class Student(val kierunekStudiow: String)

fun main(){
    val pierwszyStudent = Student("Informatyka")
    val drugiStudent = Student("Informatyka")
    
    println(pierwszyStudent == drugiStudent)
// wartość będzie true, jeśli chcielibyśmy to samo zrobić na class zamiast data class to będzie false
}
```

`when` - zastępuje `switch` znany w innych językach programowania, lecz nie wymaga instrukcji break

```kotlin
val planeta = "Ziemia"

when(planeta){
    "Slonce" -> print("Jest to Slonce")
    "Ksiezyc" -> print("Jest to Ksiezyc")
    "Ziemia" -> print("Jest to Ziemia")
    else -> print("Nie znam")
}
```