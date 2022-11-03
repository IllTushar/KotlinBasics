package Inhertance
interface MyInterface{
    fun B(){
        print("Tushar")
    }
}
class C: MyInterface{
    override fun B(){
        print("Is Good !!")
    }
}
fun main() {
    var p =C()
    p.B()
}