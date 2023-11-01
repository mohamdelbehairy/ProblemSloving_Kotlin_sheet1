import kotlin.math.pow
fun main() {
    print("Enter a half radius: ")
    val π = 3.141592653;
    var number: Double = readLine()!!.toDouble()
    var area: Double = π * (number.pow(2.0))
    
    println(area)
}