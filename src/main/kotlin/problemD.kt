fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")

    var num1 = numbersList[0].toInt()
    var num2 = numbersList[1].toInt()
    var num3 = numbersList[2].toInt()
    var num4 = numbersList[3].toInt()

    println("Difference = " + ((num1*num2)-(num3*num4)))
}