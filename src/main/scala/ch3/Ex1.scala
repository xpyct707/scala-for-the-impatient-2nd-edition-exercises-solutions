package ch3

import scala.util.Random

object Ex1 extends App {
  val n = 10
  val a = for (i <- 0 until n) yield Random.nextInt(n)
  println(a.mkString(", "))
}
