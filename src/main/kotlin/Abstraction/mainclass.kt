package Abstraction

fun main() {
    val coffe = NewCoffeClass("Cream",1000)
    println(coffe.name)
    println(coffe.overridefunction())
    println(coffe.coffe("Capaccino"))
}