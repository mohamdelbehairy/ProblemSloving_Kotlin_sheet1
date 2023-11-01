fun main() {
    print("Enter Numbers: ")
    var numbers = readln()!!.toInt()
    var sum = 0

    for(i in numbers.toString()) {
        var num = i.toString().toInt()
        sum += num
    }
    println(sum)
}