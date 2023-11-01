fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!

    var numbersList: List<String> = numbers.split(" ")
    var mul = numbersList[0].toInt() * numbersList[1].toInt() * numbersList[2].toInt() * numbersList[3].toInt()
    
    var mulString = mul.toString()
    print(mulString[mulString.length-2])
    println(mulString.last())
}