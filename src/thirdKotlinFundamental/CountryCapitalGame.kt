package thirdKotlinFundamental

import kotlin.random.Random

fun main(){
    class Country(val name: String, val capital: String){
        fun display(){
            println("The capital of $name, is $capital")
        }
    }

    val countries = listOf(
        Country("Germany", "Berlin"),
        Country("USA", "Washington DC"),
        Country("Japan", "Tokyo"),
        Country("UAE", "Abu Dhabi"),
        Country("Bosnia", "Sarajevo"),
        Country("Greece", "Athens"),
        Country("France", "Paris"),
        Country("Turkey", "Ankara"),
        Country("Philippines", "Manila"),
        Country("Brazil", "Brasilia")
    )

    var question = 0
    var score = 0

    while(true){
        val currentCountry = countries[Random.nextInt(countries.size)]
        println("What is the capital of ${currentCountry.name}?")
        question ++
        val answer = readLine()
        if(answer!! == currentCountry.capital){
            println("You got it!")
            score ++
        }else{
            println("Wrong guess.")
            currentCountry.display()
        }
        if(question >= 3){
            println("You have guessed $score out of 3 correctly.")
            question = 0
            score = 0
            print("Would you like to play again? (Y/N)")
            if(readLine()!!.uppercase() != "Y"){
                break
            }
        }
    }
}