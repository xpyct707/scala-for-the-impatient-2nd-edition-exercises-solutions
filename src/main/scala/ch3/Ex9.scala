package ch3

import scala.collection.mutable.ArrayBuffer

object Ex9 extends App {
  val ab = ArrayBuffer(0, 1, -1, 5, -2, 2, 3, -3, -4, 0, -5, -2, 4, 3, -6)
  val firstNegativeElementPosition = ab.indexWhere(_ < 0)
  val positionAfterFirstNegativeElement = if (firstNegativeElementPosition == -1
      || firstNegativeElementPosition == ab.length - 1) ab.length - 1
    else firstNegativeElementPosition + 1
  var firstElementToRemovePosition = ab.indexWhere(_ < 0, positionAfterFirstNegativeElement)
  firstElementToRemovePosition
    = if (firstElementToRemovePosition == -1) ab.length else firstElementToRemovePosition
  var firstElementToKeepPosition = ab.indexWhere(_ < 0, firstElementToRemovePosition)
  firstElementToKeepPosition
    = if (firstElementToKeepPosition == -1) ab.length else firstElementToKeepPosition
  val elementsToKeepPositions =
    for (i <- firstElementToKeepPosition until ab.length if ab(i) >= 0) yield i
  for (i <- elementsToKeepPositions.indices)
    ab(i + firstElementToRemovePosition) = ab(elementsToKeepPositions(i))
  ab.trimEnd(ab.length - firstElementToRemovePosition - elementsToKeepPositions.length)
  assert(ab sameElements Array(0, 1, -1, 5, 2, 3, 0, 4, 3))
  println(ab)
}
