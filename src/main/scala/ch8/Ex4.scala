package ch8

object Ex4 extends App {
  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(override val price: Double, override val description: String)
    extends Item

  import scala.collection.mutable.ListBuffer
  class Bundle(val items: ListBuffer[Item]) extends Item {
    override def price = {
      var sum = 0.0
      items.foreach(item => sum += item.price)
      sum
    }

    override def description = {
      var commonDescription = "The bundle includes:"
      items.foreach(item => commonDescription += f"\n${item.description}")
      commonDescription
    }
  }

  val i1 = new SimpleItem(1, "i1")
  val i2 = new SimpleItem(2, "i2")
  val b = new Bundle(ListBuffer(i1, i2))
  assert(b.price == 3)
  assert(b.description == "The bundle includes:\ni1\ni2")

  val i3 = new SimpleItem(3, "i3")
  b.items += i3
  assert(b.price == 6)
  assert(b.description == "The bundle includes:\ni1\ni2\ni3")
}
