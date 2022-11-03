package Abstraction

abstract class CoffeeClass(
    private var color :String,
    private var price :Int
)
{
   abstract val name:String
   abstract fun overridefunction():String
   open fun coffe(types: String):String
    {

           return "This is Base Coffe ${types}"

    }
}