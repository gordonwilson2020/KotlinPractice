

fun main(){

    for (i:Int in 1..10){
        print("Enter your name: ")
        val name:String = readLine()!!.toString()
        print("Where do you live?: ")
        val livePlace:String = readLine()!!.toString()

        for ( petID:Int in 1..3){
            print("Enter Pet $petID: ")
            val petName:String = readLine()!!.toString()
        }

        println("====User Info====")
        println("name: $name")
        println("livePlace: $livePlace")
        println("petName: $petName")

    }

}