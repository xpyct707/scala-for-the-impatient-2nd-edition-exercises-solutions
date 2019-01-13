package ch8

object Ex11 extends App {
  class Point(private val coordinate: Long) extends AnyVal {
    def x = (coordinate >> Integer.SIZE).toInt
    def y = coordinate.toInt
  }

  def test(x: Int, y: Int): Unit = {
    def c = (x.toLong << Integer.SIZE) | (y & 0xffffffffL)

    val point = new Point(c)
    assert(point.x == x)
    assert(point.y == y)
  }

  test(0, 0)
  test(777, -999)
  test(-777, 999)
  test(-777, -999)
}
