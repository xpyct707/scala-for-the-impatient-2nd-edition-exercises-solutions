package ch6

class Point(private val x: Int,
            private val y: Int) {
}

object Point {
  def apply(x:Int, y: Int) = {
    new Point(x, y)
  }
}