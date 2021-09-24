package thirdKotlinFundamental

fun main() {
    abstract class Vehicle {
        var color = "Blue"
        abstract fun doors()
    }

    class FamilyCar : Vehicle() {
        override fun doors() {
            println("This car has 4 doors")
        }
    }

    class SportsCar : Vehicle() {
        override fun doors() {
            println("This car has 2 doors")
        }
    }
    FamilyCar().doors()  // --> This car has 4 doors
    println("The family car is ${FamilyCar().color}.")  // --> The family car is Blue.
    val mySportsCar = SportsCar()
    mySportsCar.doors()  // --> This car has 2 doors
    mySportsCar.color = "Red"
    println("The color of my sports car is ${mySportsCar.color}.") // --> The color of my sports car is Red.
}