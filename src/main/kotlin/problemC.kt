fun main() {
    print("Enter Numbers: ")
    var nums = readLine()!!
    var numbers: List<String> = nums.split(" ")

    var num1 = numbers[0].toInt()
    var num2 = numbers[1].toInt()

    println("$num1 + $num2 = " + (num1+num2))
    println("$num1 * $num2 = " + (num1*num2))
    println("$num1 - $num2 = " + (num1-num2))
}