package week11

interface Switchable{
    fun turnOn()
    fun turnOff()
}

class LightBulb: Switchable{
    override fun turnOn() {
        println("The bulb is lit")
    }
    override fun turnOff() {
        println("Darkness")
    }
}

class Fan: Switchable{
    override fun turnOn() {
        println("The windmill is spinning")
    }
    override fun turnOff() {
        println("The fan stopped")
    }
}

fun activateDevice(device: Switchable){
    device.turnOn()
    device.turnOff()
}

fun main(){
    val bulb = LightBulb()
    val fan = Fan()

    activateDevice(bulb)
    activateDevice(fan)
}