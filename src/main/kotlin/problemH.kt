import kotlin.math.round
import kotlin.math.floor
import kotlin.math.ceil
fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")
    
    var num1 = numbersList[0].toDouble()
    var num2 = numbersList[1].toDouble()

    println("floor $num1 / $num2 = " + floor((num1 / num2)).toInt())
    println("ceil $num1 / $num2 = " + ceil((num1 / num2)).toInt())
    println("round $num1 / $num2 = " + round((num1 / num2)).toInt())
}