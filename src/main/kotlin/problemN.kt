fun main() {
    print("Enter a litter: ")
    var litter = readLine()!!

    if(litter >= "a" && litter <= "z") println(litter.uppercase()) 
    else if(litter >= "A" && litter <= "Z") println(litter.lowercase())
    else println("Unkown litter")  
}