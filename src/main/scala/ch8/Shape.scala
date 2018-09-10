package ch8

abstract class Shape {
  def centerPoint: Point
}

class Rectangle(val length: Double, val width: Double) extends Shape {
  def centerPoint: Point = new Point(length / 2, width / 2)
}

class Circle(val radius: Double) extends Shape {
  def centerPoint: Point = new Point(radius, radius)
}
