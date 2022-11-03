package PredefineDelegates

import kotlin.properties.Delegates

class Student{
    init {
        println("This is student class message !!")
    }
}
class Details{
    val heavy by lazy { Student() }

    var number:Int by Delegates.observable(50){
        property, oldValue, newValue ->
        println("old value $oldValue")
        println("New Value $newValue")
    }
    var age:Int by Delegates.vetoable(15){
        property, oldValue, newValue ->
        newValue>oldValue
    }
}
fun main() {
    val student = Details()
  //  student.heavy
   student.number=30
//    student.age=13
//    println(student.age)
//    student.age =16
//    println(student.age)
}