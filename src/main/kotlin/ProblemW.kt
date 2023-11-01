fun main() {
    print("Enter Inputs: ")
    var inputs = readLine()!!

    var inputsList: List<String> = inputs.split(" ")
    var num1 = inputsList[0].toInt()
    var sign = inputsList[1]
    var num2 = inputsList[2].toInt()
    var num3 = inputsList[4].toInt()

    if(sign == "+") {
        if(num1 + num2 == num3) {
            println("Yes")
        } else println("Oops error, The correct answer Is: " + (num1 + num2))
    } 
    
    else if(sign == "-") {
        if(num1 - num2 == num3) {
            println("Yes")
        } else println("Oops error, The correct answer Is: " + (num1 - num2))
    } 
    
    else if(sign == "*") {
        if(num1 * num2 != num3) {
            println(num1 * num2)
        } else println("Yes")
    } 
    
    else println("Invalid Inputs!")
    
}