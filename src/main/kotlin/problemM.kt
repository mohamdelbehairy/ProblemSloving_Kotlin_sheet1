fun main() {
    print("Enter a letter: ")
    var letter = readLine()!!

    if(letter >= "A" && letter <= "Z") {
        println("ALPHA")
        println("IS CAPITAL")
    } else if(letter >= "a" && letter <= "z") {
        println("ALPHA")
        println("IS SMALL")
    } else {
        println("IS DIGIT")
    }

}