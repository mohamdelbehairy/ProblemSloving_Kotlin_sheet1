import kotlin.math.pow
fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")
    
    var num1 = numbersList[0].toDouble()
    var num2 = numbersList[1].toDouble()
    var num3 = numbersList[2].toDouble()
    var num4 = numbersList[3].toDouble()

    if(num1.pow(num2) > num3.pow(num4)) println("Yes")
    else if(num1.pow(num2) == num3.pow(num4)) println("Equal")
    else println("NO")
}