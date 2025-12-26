package week4

fun main(){
    val inventory = mutableListOf<String>("sword", "shield", "mixture")

    println("Hero uses a mixture")
    inventory.remove("mixture")
    inventory.add("Gold ring")
    inventory[1] = "Broken shield"

    println(inventory)
    println("Size: " + inventory.size)
}