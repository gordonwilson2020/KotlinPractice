
fun main(){

    // Enter your name
    print("Enter your name: ")
    val name:String = readLine()!!.toString()
    // Ask for age
    print("Enter your age: ")
    val age:Int = readLine()!!.toInt()
    //Ask for GPA
    print("Enter GPA: ")
    val GPA:Double = readLine()!!.toDouble()

    println("====User Info====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")


}