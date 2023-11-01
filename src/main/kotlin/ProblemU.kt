fun main() {
    print("Enter Number: ")
    var num = readLine()!!
    var numbersList = num.split(".")
    
    if(numbersList.size > 1 && numbersList[1] != "000") {
        var intNumber = numbersList[0]
        var floatNumber = numbersList[1]
        println("float $intNumber 0.$floatNumber")
    } else {
        var intNumber = numbersList[0]
        println("int $intNumber")
    }
}