package ch12

object Ex8 extends App {
  val a = Array("He", "llo", "", "Worl", "d")
  val b = Array(2, 3, 0, 4, 1)
  println(a.corresponds(b)(_.length == _))
}
