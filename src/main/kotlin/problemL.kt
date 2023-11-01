fun main() {
    print("Enter First Name: ")
    var name1= readLine()!!

    print("Enter Second Name: ")
    var name2 = readLine()!!

    var list1: List<String> = name1.split(" ")
    var list2: List<String> = name2.split(" ")
    
    if(list1[1] == list2[1])println("ARE Brothers")
    else println("NOT")
}