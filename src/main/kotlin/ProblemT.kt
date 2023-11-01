fun main() {
    print("Enter Numbers: ")
    var num = readLine()!!

    var numbers : List<String> = num.split(" ")
    var numberList =  numbers.sorted()

    for(x in numberList) {
        println(x)
    }
    println()
    println(numbers[0])
    println(numbers[1])
    println(numbers[2])
}