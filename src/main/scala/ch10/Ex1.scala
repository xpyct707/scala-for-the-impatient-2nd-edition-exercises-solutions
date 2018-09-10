package ch10

import java.awt.Rectangle
import java.awt.geom.{Ellipse2D, RectangularShape}

object Ex1 extends App {
  trait RectangleLike extends RectangularShape {
    private val rectangle = new Rectangle(
      getX.toInt, getY.toInt, getWidth.toInt, getHeight.toInt)
    def translate(dx: Int, dy: Int): Unit = {
      rectangle.translate(dx, dy)
      copyFrame()
    }

    private def copyFrame() {
      setFrame(rectangle.x, rectangle.y, rectangle.width, rectangle.height)
    }

    def grow(h: Int, v: Int): Unit = {
      rectangle.grow(h, v)
      copyFrame()
    }
  }

  val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  egg.translate(10, -10)
  println(s"${egg.x} ${egg.y} ${egg.width} ${egg.height}")
  egg.grow(10, 20)
  println(s"${egg.x} ${egg.y} ${egg.width} ${egg.height}")
}
