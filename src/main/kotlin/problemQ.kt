fun main() {
    tr@while(true) {
        try {
            print("Enter Numbers: ")
            var numbers = readLine()!!
            var numbersList: List<String> = numbers.split(" ")

            var num1 = numbersList[0].toDouble()
            var num2 = numbersList[1].toDouble()
            
            if(num1 > 0 && num2 > 0) println("Q1")
            else if(num1 > 0 && num2 < 0) println("Q4")
            else if(num1 < 0 && num2 > 0 ) println("Q2") 
            else if(num1 < 0 && num2 < 0) println("Q3")
            else if(num1 == 0.0 && num2 == 0.0) println("Origem")
            else if(num1 == 0.0 && (num2 > 0.0 || num2 < 0.0)) println("Eixo X")
            else if(num2 == 0.0 && (num1 > 0.0 || num1 < 0.0)) println("Eixo Y")
            else println("Invalid number")
            break@tr
        } catch(e:Exception) {
        println("Plese Enter Again")
        continue@tr
        }
    }
}