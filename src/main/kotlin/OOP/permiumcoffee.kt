package OOP

class permiumcoffee(
    var newColor:String,
    var newPrice:Int
):Coffee(newColor,newPrice)
{
    override fun cofeeMessage()
    {
        println("The new Coffe here")
    }
}