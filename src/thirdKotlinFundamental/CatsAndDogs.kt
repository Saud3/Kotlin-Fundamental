package thirdKotlinFundamental
import kotlin.random.Random

/*
Cats and Dogs
Create an abstract class Animal with attributes name and age and abstract function talk
Create a class Dog that inherits Animal and barks ('Name: Woof')
Create a class Cat that inherits Animal and meows ('Name: Meow')

Create a list of five dogs and a list of five cats with random ages
Use a loop to iterate through the list of cats and make each cat meow, also use a nested loop to make each dog bark if they are older than the meowing cat
 */

fun main(){

    abstract class Animal(name: String, age: Int) {
        abstract fun talk()
    }

    class Dog(val name: String, val age: Int):
        Animal(name, age){
        override fun talk(){
            println("$name: Woof")
        }
    }

    class Cat(val name: String, val age: Int):
        Animal(name, age){
        override fun talk() {
            println("$name: Meow")
        }
    }
    val ages = arrayOf(2, 7, 8, 10, 1, 12, 5, 7, 9)

    val dogs = arrayOf<Dog>(
        Dog("Taiyo", ages[Random.nextInt(ages.size)]),
        Dog("Tsuki", ages[Random.nextInt(ages.size)]),
        Dog("Aka", ages[Random.nextInt(ages.size)]),
        Dog("Aoi", ages[Random.nextInt(ages.size)]),
        Dog("Kuro", ages[Random.nextInt(ages.size)])
    )

    val cats = arrayOf<Cat>(
        Cat("Jiji", ages[Random.nextInt(ages.size)]),
        Cat("Yuri", ages[Random.nextInt(ages.size)]),
        Cat("Yuki", ages[Random.nextInt(ages.size)]),
        Cat("Hana", ages[Random.nextInt(ages.size)]),
        Cat("Sakura", ages[Random.nextInt(ages.size)])
    )

    for(cat in cats){
        cat.talk()
        for(dog in dogs){
            if(cat.age < dog.age){
                dog.talk()
            }
        }
    }
}

