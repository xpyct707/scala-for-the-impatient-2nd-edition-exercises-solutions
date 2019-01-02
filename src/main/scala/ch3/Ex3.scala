package ch3

import scala.reflect.ClassTag

object Ex3 extends App {
  def swapAdjacentElements[T: ClassTag](a: Array[T]):Array[T] = {
    def swap(a: Array[T], len: Int): Array[T]
      = (for (i <- 0 until len) yield if (i % 2 == 0) a(i + 1) else a(i - 1)).toArray
    if (a.length % 2 == 0){
      swap(a, a.length)
    } else {
      (swap(a, a.length - 1).toBuffer += a.last).toArray
    }
  }

  val a0 = Array(1, 2, 3, 4, 5)
  val a0s = swapAdjacentElements(a0)
  assert(a0s sameElements Array(2, 1, 4, 3, 5))
  println(a0s.mkString(", "))

  val a1 = Array(1, 2, 3, 4, 5, 6)
  val a1s = swapAdjacentElements(a1)
  assert(a1s sameElements Array(2, 1, 4, 3, 6, 5))
  println(a1s.mkString(", "))

}
