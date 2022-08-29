fun main(args:Array<String>){
    var name :String
    name = "Gold"
    var personObject = Person()
    personObject.display(name)
}
class Person{
    fun display(name :String){
        print("The old is always ${name}")
    }
}