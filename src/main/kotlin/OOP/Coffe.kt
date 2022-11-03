package OOP

open class Coffee(
    private var color:String,
     private var price :Int
)
{
    open fun cofeeMessage(){
        println("Coffee ready!!")
    }
}