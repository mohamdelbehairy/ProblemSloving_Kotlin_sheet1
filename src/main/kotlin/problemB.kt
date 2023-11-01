fun main() {
    print("Enter What do you want? ")
    var num = readLine()!!
    var value = num.split(" ")
    
    for(x in value) println(x)
}