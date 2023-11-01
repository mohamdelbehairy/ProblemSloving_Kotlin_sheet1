fun main() {
    print("Enter Numbers: ")
    var numbers = readLine()!!
    var numbersList: List<String> = numbers.split(" ")

    var num1 = numbersList[0].toInt()
    var num2 = numbersList[1].toInt()
    var num3 = numbersList[2].toInt()

    if(num1 > num2 && num1 > num3) {
        if(num2 > num3) {
            println(num3)
            println(num1)  
        } else {
            println(num2)
            println(num1)  
        }   
    }
    
    else if(num2 > num1 && num2 > num3) {
        if(num1 > num3) {
            println(num3)
            println(num2)
        } else {
            println(num1)
            println(num2)
        }    
    }

    else {
        if(num1 > num2) {
            println(num2)
            println(num3)
        }
        else {
            println(num1)
            println(num3)
        }
    }
}
  