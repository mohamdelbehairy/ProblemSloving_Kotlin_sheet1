fun main() {
    print("Enter Numbers: ")
    val numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")

    var num1 = numbersList[0].toInt()
    var num2 = numbersList[1].toInt()

    if(num1 >= num2) println("Yes")
    else println("No")
}