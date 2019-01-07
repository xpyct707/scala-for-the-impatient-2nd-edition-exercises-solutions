package ch6

object Ex3 extends App {
  object Origin extends java.awt.Point(0, 0) {}

//  This is not a good idea because the Point class is mutable so there is no safe way
//  to share it instance efficiently.

  Origin.x = 100
  assert(Origin.getX == 100)

  Origin.y = 500
  assert(Origin.getY == 500)
}
