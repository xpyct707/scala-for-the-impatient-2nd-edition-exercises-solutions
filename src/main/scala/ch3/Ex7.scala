package ch3

object Ex7 extends App {
  val a = Array(0, 1, -1, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3)
  val b = a.distinct
  assert(b sameElements Array(0, 1, -1, -2, 2, 3, -3, -4, -5, 4))
  println(b.mkString(", "))
}
