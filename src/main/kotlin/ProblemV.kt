fun main() {
    print("Enter Inputs: ")
    var inputs  = readLine()!!

    var list :List<String> = inputs.split(" ")
    var num1 = list[0]
    var sign = list[1]
    var num2 = list[2]

    if((sign == ">" && num1 != num2) == true) {
        if(num1 > num2) {
            println("Right")
        } else println("Wrong, Smaller")
    } else if(sign == "<" && num1 != num2) {
        if(num1 < num2) {
            println("Right")
        } else println("Wronge, smaller")
    } else if(sign == "=") {
        println("Right,Equal")
    } else println("Invalid!")
}