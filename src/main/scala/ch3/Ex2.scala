package ch3

object Ex2 extends App {
  def swapAdjacentElements[T](a: Array[T]) {
    for (i <- a.indices if i % 2 != 0) {
      val oddElement = a(i)
      a(i) = a(i - 1)
      a(i - 1) = oddElement
    }
  }
  val a0 = Array(1, 2, 3, 4, 5)
  swapAdjacentElements(a0)
  assert(a0 sameElements Array(2, 1, 4, 3, 5))
  println(a0.mkString(", "))

  val a1 = Array(1, 2, 3, 4, 5, 6)
  swapAdjacentElements(a1)
  assert(a1 sameElements Array(2, 1, 4, 3, 6, 5))
  println(a1.mkString(", "))
}
