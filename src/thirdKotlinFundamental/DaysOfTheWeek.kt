package thirdKotlinFundamental

fun main(){
    //Create a dictionary that uses numbers 1 - 7 for keys and days of the week as values
    val week = mapOf(1 to "Sunday", 2 to "Monday", 3 to "Tuesday", 4 to "Wednesday", 5 to "Thursday", 6 to "Friday", 7 to "Saturday")
    //Print each day of the week using a for loop
    for(i in 1..7){
        println(week[i])
    }

}