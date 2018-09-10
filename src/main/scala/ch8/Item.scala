package ch8

abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val price: Double, override val description: String)
  extends Item

import scala.collection.mutable.MutableList
class Bundle(val items: MutableList[Item]) extends Item {
  override def price: Double = {
    var sum = 0.0
    items.foreach(item => sum += item.price)
    sum
  }

  override def description: String = {
    var commonDescription = "The bundle includes:"
    items.foreach(item => commonDescription += f"\n${item.description}")
    commonDescription
  }
}

object ItemApp extends App {
  val i1 = new SimpleItem(1, "i1")
  val i2 = new SimpleItem(2, "i2")
  val i3 = new SimpleItem(3, "i3")

  val b = new Bundle(MutableList(i1, i2, i3))
  println(b.price)
  println(b.description)
}
