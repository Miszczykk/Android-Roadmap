package week7

class Player(val nickname: String, var healthPoints: Int) {
    fun takeDamage(damage: Int){
        healthPoints-=damage
        println("$nickname got $damage damage. $healthPoints health points left")
    }
}
fun main(){
    val player = Player("Witcher", 100)
    player.takeDamage(20)
    player.takeDamage(50)
    println(player.healthPoints)
}