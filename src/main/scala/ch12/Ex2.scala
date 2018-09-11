package ch12

object Ex2 extends App {
  def getMax(array: Array[Int]): Int = {
    array.reduceLeft((a, b) => if (a > b) a else b)
  }

  println(getMax(Array(1, 5, 3, 5, 6, 9, 0)))
}
