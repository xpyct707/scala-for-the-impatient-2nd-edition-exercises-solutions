package ch3

object Ex4 extends App {
  val a = Array(0, 1, -1, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3)
  val res = a.sortWith((a, b) => a > 0 && b <= 0)
  assert(res sameElements Array(1, 2, 3, 4, 3, 0, -1, -2, -3, -4, 0, -5, -2))
  println(res.mkString(", "))
  println(a.mkString(", "))
}
