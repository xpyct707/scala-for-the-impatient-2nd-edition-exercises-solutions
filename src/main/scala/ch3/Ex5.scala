package ch3

object Ex5 extends App {
  val a = Array(0.1, -1.2, 3.4, -5.6, 7.8, -9)
  assert(a.sum / a.length == -0.75)
}
