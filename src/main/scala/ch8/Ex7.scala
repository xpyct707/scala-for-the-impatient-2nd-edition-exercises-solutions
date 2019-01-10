package ch8

object Ex7 extends App {
  class Square(x: Int, y: Int, width: Int)
    extends java.awt.Rectangle(x, y, width, width) {

    def this(width: Int) {
      this(0, 0, width)
    }

    def this() {
      this(0)
    }
  }

  val square0 = new Square(5, 10, 20)
  assert(square0.height == 20)
  assert(square0.width == 20)
  assert(square0.x == 5)
  assert(square0.y == 10)

  val square1 = new Square(5)
  assert(square1.height == 5)
  assert(square1.width == 5)
  assert(square1.x == 0)
  assert(square1.y == 0)

  val square2 = new Square()
  assert(square2.height == 0)
  assert(square2.width == 0)
  assert(square2.x == 0)
  assert(square2.y == 0)
}
