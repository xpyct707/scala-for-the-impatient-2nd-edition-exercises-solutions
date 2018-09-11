package ch12

import scala.collection.mutable.ArrayBuffer

object Ex1 extends App {
  def values(fun: Int => Int, low: Int, high: Int): Array[(Int, Int)] = {
    val result = ArrayBuffer[(Int, Int)]()
    (low to high).foreach(input => result += Tuple2(input, fun(input)))
    result.toArray
  }

  println("x => x * x")
  values(x => x * x, -5, 5).foreach(println)
  println("x => x + x")
  values(x => x + x, -5, 5).foreach(println)
}
