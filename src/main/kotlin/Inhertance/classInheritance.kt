package Inhertance
open class A{
    open fun B(){
        println("Thinker !!")
    }
}
class classInheritance : A()
{
    override fun B() {
        super.B()  //super keyword refer parent class obj
        println("Tushar Thinker !!")
    }
}
fun main(args:Array<String>)
{
      var c  =classInheritance()
    c.B()
}