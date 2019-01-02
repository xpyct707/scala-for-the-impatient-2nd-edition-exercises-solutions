package ch3

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Ex6 extends App {
  val a = Array(0, 1, -1, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3)
  Sorting.stableSort(a, (a: Int, b: Int) => a > b)
  assert(a sameElements Array(4, 3, 3, 2, 1, 0, 0, -1, -2, -2, -3, -4, -5))
  println(a.mkString(", "))

  val ab = ArrayBuffer(0, 1, -1, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3)
  for (i <- ab.indices)
    for (j <- i + 1 until ab.length)
      if (ab(i) < ab(j)) {
        val t = ab(i)
        ab(i) = ab(j)
        ab(j) = t
      }
  assert(ab sameElements Array(4, 3, 3, 2, 1, 0, 0, -1, -2, -2, -3, -4, -5))
  println(ab)
}
