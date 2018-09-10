package ch8

class Point(val x: Double, val y: Double)

class LabeledPoint(val label: String, x: Double, y: Double)
  extends Point(x, y)

object Test8 extends App {
  val lp = new LabeledPoint("test", 1929, 230.07)
}