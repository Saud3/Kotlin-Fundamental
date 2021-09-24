package secondKotlinFundametal
import java.lang.Exception

fun main(){
    fun checkNumber(num: String): Int{
        try {
            return num.toInt()
        }catch (e: Exception){
            return 0
        }
    }

    fun add(num1: Int, num2: Int): Int{
        return num1 + num2
    }

    while(true){
        print("Enter your first number:  ")
        val num1 = checkNumber(readLine()!!)
        print("Enter your second number:  ")
        val num2 = checkNumber(readLine()!!)

        println("$num1 + $num2 = ${add(num1, num2)}")

        print("Would you like to add more numbers? (Y/N) >> ")
        val addMore = readLine()
        if(addMore != "Y" && addMore != "y"){
            break
        }
    }
}