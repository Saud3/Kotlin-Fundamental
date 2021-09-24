
fun main() {

    fun verifieNumber(num: String): Int {
        try {
            return num.toInt()
        } catch (e: Exception) {
            return 0
        }
    }

    fun addNumber(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    while (true) {
        print("Enter your first number : ")
        val num1 = verifieNumber(readLine()!!)
        print("Enter your second number : ")
        val num2 = verifieNumber(readLine()!!)
        println("$num1 + $num2 = ${addNumber(num1, num2)}")

        print("Would you like add more numbers? (Y/N) >>")
        val addMore = readLine()
        if (addMore != "y" && addMore != "y")
            break
    }
}