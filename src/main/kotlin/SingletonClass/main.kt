package SingletonClass
object Manager:A(){
    init {
        println("This message send by manager!!")
    }
    var value:Int =10
    override fun display() {
        super.display()
        println("This method is overriding by Manager Class")
    }

}
fun main() {
    println(Manager)
    Manager.value = 24
    println("New Value is: ${Manager.value}")
    println(Manager.display())
    println(A.getInstance())
    A.age=12
    println(A.age)
}
open class A{
    open fun display(){
        println("This is class A")
    }
    companion object{
        var age :Int =10
        fun getInstance():String{
            return "This Comapnion"
        }
    }

}