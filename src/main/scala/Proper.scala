case class Proper(val id: Long, val name: String, val age: Int)

object Proper {
  
  def admit(name:String, age: Int)(implicit impl: ProperImpl): Proper = {
    impl.admit(name, age)
  }

}

class ProperImpl {
  def admit(name: String, age: Int):Proper = {
    Proper(0L, name, age)
  }
}
