fun main() {
    print("Enter Inputs: ")
    var inputs = readLine()!!
    var inputsList: List<String> = inputs.split(" ")

    var num1 = inputsList[0].toInt()
    var sign = inputsList[1].toString()
    var num2 = inputsList[2].toInt()

    when {
        sign == "+" -> println(num1+num2)
        sign == "*" -> println(num1*num2)
        sign == "/" -> println(num1/num2)
        else -> println("Unkown operation")
    }

    // if(sign == "+") println(num1+num2)
    // else if(sign == "*") println(num1*num2)
    // else if(sign == "/") println(num1/num2)
    // else println("Unkown operation")
}