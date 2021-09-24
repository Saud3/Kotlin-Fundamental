package thirdKotlinFundamental
/*
Country Capitals (Dictionary)
Create a mutable dictionary
Ask users to enter a country and save it as the key
Ask user to enter a capital and save it as the value
After user has entered 3 pairs, print each country and its capital
 */

fun main(){
    val countryAndCapital = mutableMapOf(
        "" to "",
    )
    for (i in 1..3) {
        var country = ""
        var capital = ""

        print("Enter a country: ")
        country = readLine()!!
        print("Enter a capital: ")
        capital = readLine()!!

        countryAndCapital.put(country, capital)
    }
        for(i in countryAndCapital){
            println("${i.key}: ${i.value}")
        }


    }
