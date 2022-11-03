package OOP

class Boxes(
    var length:Int,
    var height:Int,
    var width:Int
)
{
    init {
        println("This is init block..")
    }
    val getVolume
        get() = length*height*width

}