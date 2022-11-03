package NewDelegationMethod

import kotlin.reflect.KProperty

class Student{
    var firstName:String? by studentName()
    var lastName:String ? by studentName()
    override fun toString(): String {
        return "$firstName $lastName"
    }
}
class studentName{
    var formattingString:String ?=null
    operator fun getValue(student: Any?, property: KProperty<*>): String? {
        return formattingString
    }

    operator fun setValue(student: Any?, property: KProperty<*>, s: String?) {
      if (s!=null && s.length>3)
      {
          formattingString= s.trim().uppercase()
      }
    }

}

fun main()
{
  val name = Student()
  name.firstName = "Tushar"
  name.lastName = "Gupta"
  print(name)
}