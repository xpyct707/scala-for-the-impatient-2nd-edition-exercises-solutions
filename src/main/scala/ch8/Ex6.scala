package ch8

object Ex6 extends App {
  abstract class Shape {
    def centerPoint: Ex5.Point
  }

  class Rectangle(val length: Double, val width: Double) extends Shape {
    def centerPoint: Ex5.Point = new Ex5.Point(length / 2, width / 2)
  }

  class Circle(val radius: Double) extends Shape {
    def centerPoint: Ex5.Point = new Ex5.Point(radius, radius)
  }

  val rectangle = new Rectangle(10, 20)
  assert(rectangle.centerPoint.x == 5)
  assert(rectangle.centerPoint.y == 10)

  val circle = new Circle(10)
  assert(circle.centerPoint.x == 10)
  assert(circle.centerPoint.y == 10)
}
