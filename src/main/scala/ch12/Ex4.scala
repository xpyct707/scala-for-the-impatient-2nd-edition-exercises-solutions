package ch12

object Ex4 extends App {
  def factorial(i: Int): Long = {
    if (i < 0) throw new IllegalArgumentException
    (1 to i).foldLeft(1)(_ * _)
    //    (1 to i).product
  }

  println(s"factorial(0) = ${factorial(0)}")
  println(s"factorial(1) = ${factorial(1)}")
  println(s"factorial(5) = ${factorial(5)}")
  println(s"factorial(10) = ${factorial(10)}")
}
