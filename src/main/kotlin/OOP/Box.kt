package OOP

class Box
{
  val width :Int=10
  val height:Int =20
    // getter and setter in kotlin
  val getVolume
      get() =width*height
  var setVolume:String=""
      set(value) {
          field= value
      }
}