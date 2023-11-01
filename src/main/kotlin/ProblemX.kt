fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String>  = numbers.split(" ")
    
    var num1 = numbersList[0].toInt()
    var num2 = numbersList[1].toInt()
    var num3 = numbersList[2].toInt()
    var num4 = numbersList[3].toInt()

    if(num2 > num3 && num4 > num1) {
        if(num2 > num1 && num4 > num3) {
            println("$num3 $num2")
        } else println("Oops error, try again!")
        
    } else  if(num2 < num3 && num4 > num1) {
        if(num2 > num1 && num4 > num3) {
            println(-1)
        } else println("Oops error, try again!")
        
    } else println("Invalid Numbers!")
}