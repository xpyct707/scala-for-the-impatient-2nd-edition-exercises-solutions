package ch12

object Ex3 extends App {
  def factorial(i: Int): Long = {
    if (i < 0) throw new IllegalArgumentException
    if (i < 2) return 1
    (1 to i).reduceLeft(_ * _)
//    (1 to i).product
  }

  println(s"factorial(0) = ${factorial(0)}")
  println(s"factorial(1) = ${factorial(1)}")
  println(s"factorial(5) = ${factorial(5)}")
  println(s"factorial(10) = ${factorial(10)}")
}
