//fun main(args:Array<String>){
//  val number = 1..5
//    //print 1,2,3,4,5
//    val number1 = 5 downTo 1
//        //print 5,4,3,2,1
//    val number2 = 5 downTo 1 step 2
//    //print 5,3,1
//    val number3 = 'a'..'z'
//    //print a,b,c,d,e,f,g,h,i..z
//    val isPresent = 'c' in number3
//    //print c is present
//
// // print(number)
//}
import java.util.Scanner
fun main(args : Array<String>) {
    // print("Enter text: ")
    val reader =Scanner(System.`in`)
    val num  = reader.nextInt()
    var input = readLine()!!
    var value:Int = num*2
    println(value)
    print(input)
}