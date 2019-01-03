package ch4

import scala.collection.immutable.SortedMap

object ex1 extends App {
  val defPrices = SortedMap("a" -> 1.2, "b" -> 3.4, "c" -> 5.6, "d" -> 7.8, "e" -> 9.0)
  val discPrices = for ((k, v: Double) <- defPrices) yield (k, 0.9 * v)
  assert(discPrices sameElements SortedMap(("a", 1.08), ("b", 3.06), ("c", 5.04), ("d", 7.02), ("e", 8.1)))
  println(discPrices)
}
