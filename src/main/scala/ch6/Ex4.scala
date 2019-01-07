package ch6

object Ex4 extends App {
  class Point(private val _x: Int,
              private val _y: Int) {
    def x = _x
    def y = _y
  }

  object Point {
    def apply(x:Int, y: Int) = {
      new Point(x, y)
    }
  }

  val p = Point(19, 17)
  assert(p.x == 19)
  assert(p.y == 17)
}
