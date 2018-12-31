package ch2

object Ex9 extends App {
  def product(s: String):Long = {
    if (s.isEmpty) 1
    else s.head * product(s.tail)
  }
  println(product("Hello"))
}
