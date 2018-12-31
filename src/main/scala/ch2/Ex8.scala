package ch2

object Ex8 extends App {
  def product(s: String) = {
    var r:Long = 1
    for (c <- s) r *= c
    r
  }
  println(product("Hello"))
}
