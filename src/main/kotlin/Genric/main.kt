package Genric
class ArrayList(private val array: Array<Int>){
    fun findElements(element:Int ,findElement:(index:Int,element:Int?)->Unit){
        for (i in array.indices){
            if (array[i]==element){
                print(findElement(i,array[i]))
                return
            }
        }
        print(findElement(-1,null))
        return
    }
}
fun <T,X>displar(name:T,age:X){
    print("First gen $name")
    println("Second gen $age")
}
fun main() {
var array = ArrayList(arrayOf(1,2,3,4,5))
    array.findElements(3){
        index, element ->
        println("Index $index")
        println("Element $element")
    }
    displar("Tushar",21)
}