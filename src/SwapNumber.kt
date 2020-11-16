
fun main() {

    print("Enter number 1: ")
    var number1:Int = readLine()!!.toInt()
    print("Enter number 2: ")
    var number2:Int = readLine()!!.toInt()

    var temp:Int = number1
    number1 = number2
    number2 = temp

    println("Number 1: $number1, Number 2: $number2")

}