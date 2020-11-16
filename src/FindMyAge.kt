import java.util.*

fun main() {

    print("Enter year of birth: ")
    val yearOfBirth:Int = readLine()!!.toInt()
    val yearInDevice:Int = Calendar.getInstance().get(Calendar.YEAR)
    val age:Int = yearInDevice - yearOfBirth

    print("You are $age years old")

}