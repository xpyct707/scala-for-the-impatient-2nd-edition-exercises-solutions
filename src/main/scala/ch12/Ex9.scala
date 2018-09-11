package ch12

import scala.collection.GenSeq

object Ex9 extends App {
  def corresponds[A, B](a: GenSeq[A], b: GenSeq[B], p: (A,B) => Boolean): Boolean = {
    a.corresponds(b)(p)
  }

  val a = Array("He", "llo", "", "Worl", "d")
  val b = Array(2, 3, 0, 4, 1)
  println(corresponds(a, b, (a: String, b: Int) =>  a.length == b))
}
