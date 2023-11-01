import kotlin.math.sqrt
fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")

    var nummber1 = numbersList[0]
    var num1= nummber1.last().toString().toInt()

    var nummber2 = numbersList[1]
    var num2 = nummber2.last().toString().toInt()

    println("result = "+ (num1+num2))

}