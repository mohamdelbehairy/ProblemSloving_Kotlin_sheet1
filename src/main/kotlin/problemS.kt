fun main() {
    print("Enter Number: ")
    var num = readLine()!!.toDouble()
    
    if(num >= 0 && num <= 25) println("Interval [0,25]")
    else if(num > 25 && num <= 50) println("Interval (25,50]")
    else if(num > 50 && num <= 75) println("Interval (50,75]")
    else if(num > 75 && num <= 100) println("Interval (75,100]")
    else println("Out of Intervals")
}