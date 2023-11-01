fun main() {
    print("Enter Number: ")
    var number = readLine()!!.toInt()

    var i = 0
    for(x in 1..number) i += x
    println(i)
}