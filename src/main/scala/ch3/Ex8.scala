package ch3

import scala.collection.mutable.ArrayBuffer

object Ex8 extends App {
  val ab = ArrayBuffer(0, 1, -1, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3)
  val allNegativeElementsPositions = for (i <- ab.indices if ab(i) < 0) yield i
  for (i <- allNegativeElementsPositions.tail.reverse) ab.remove(i)
  assert(ab sameElements Array(0, 1, -1, 2, 3, 0, 4, 3))
  println(ab)
}
