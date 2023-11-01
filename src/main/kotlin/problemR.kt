fun main() {
    print("Enter Number: ")
    var num: Int = readLine()!!.toInt()

    var year = num / 365
    var month = num % 365 / 30
    var day = num % 365 % 30

    print(year)
    println(" years")

    print(month)
    println(" months")

    print(day)
    println(" days")
    
}