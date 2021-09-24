package secondKotlinFundametal

fun main(){
    val countries = arrayListOf<ArrayList<String>>()

    for (i in 0..2){
        var country = ""
        var capital = ""

        print("Enter a country: ")
        country = readLine()!!
        print("Enter a capital: ")
        capital = readLine()!!

        countries.add(arrayListOf(country,capital))

    }
}