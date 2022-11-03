package Abstraction

class NewCoffeClass(
    private var color :String,
    private var price :Int
):CoffeeClass(color,price) {
    override val name: String
        get() = "Tuhar Gupta"

    override fun overridefunction(): String {
        return "This is abstract function!!!"
    }

    override fun coffe(types: String): String {
        println("This is override function!!")
        return super.coffe(types)
    }
}