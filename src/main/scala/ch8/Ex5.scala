package ch8

object Ex5 extends App {
  class Point(val x: Double, val y: Double)

  class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

  val lp = new LabeledPoint("Black Thursday", 1929, 230.07)
}
