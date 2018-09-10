package ch10

import java.awt.Point

object Ex2 extends App {
  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
    override def compare(that: Point): Int = {
      if (this.x > that.x) 1
      else if (this.x < that.x) -1
      else if (this.y > that.y) 1
      else if (this.y < that.y) -1
      else 0
    }
  }

  val p00 = new OrderedPoint(0, 0)
  val p10 = new OrderedPoint(1, 0)
  val p01 = new OrderedPoint(0, 1)

  assert(p00.compare(p00) == 0)
  assert(p10.compare(p00) == 1)
  assert(p00.compare(p10) == -1)
  assert(p00.compare(p01) == -1)
  assert(p01.compare(p00) == 1)
}
