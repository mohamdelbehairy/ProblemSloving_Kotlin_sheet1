fun main() {
    println("Welome to my app, it show odd or even number by first digit.")
    print("Enter Number: ")

    var number = readLine()!!
    var num: Int = number[0].toString().toInt()

    if(num % 2 == 0) println("EVEN")
    else println("ODD")
}
