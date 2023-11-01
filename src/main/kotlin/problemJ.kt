fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")
    
    var num1 = numbersList[0].toInt()
    var num2 = numbersList[1].toInt()

    if(num1 % num2 == 0 || num2 % num1 == 0) println("Multiples")
    else println("No Multiples")
}