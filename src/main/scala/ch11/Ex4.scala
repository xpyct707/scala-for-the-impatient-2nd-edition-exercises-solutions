package ch11

object Ex4 extends App {
  class Money(private val _dollars: Int, private val _cents: Byte) {
    if (_dollars < 0 || _cents < 0 || _cents >= 100) throw new IllegalArgumentException

    def +(other: Money): Money = {
      val centsSum = _cents + other._cents
      new Money(_dollars + other._dollars + centsSum / 100, (centsSum % 100).toByte)
    }

    def -(other: Money): Money = {
      var dollarsDiff = _dollars - other._dollars
      val msg = "Subtrahend can't be more than minuend."
      if (dollarsDiff < 0) throw new IllegalArgumentException(msg)
      val centsDiff = _cents - other._cents
      if (centsDiff < 0) {
        if (dollarsDiff == 0) throw new IllegalArgumentException(msg)
        new Money(dollarsDiff - 1, (100 + centsDiff).toByte)
      } else {
        new Money(dollarsDiff, centsDiff.toByte)
      }
    }

    def ==(other: Money): Boolean = {
      equals(other)
    }

    override def equals(obj: scala.Any): Boolean = {
      val other = obj.asInstanceOf[Money]
      if (_dollars == other._dollars) _cents == other._cents else false
    }

    def <(other: Money): Boolean = {
      if (_dollars < other._dollars) return true
      if (_dollars == other._dollars) _cents < other._cents else false
    }
  }

  object Money {
    def apply(dollars: Int, cents: Byte): Money = new Money(dollars, cents)
  }

  assert(Money(1, 15).equals(Money(1, 15)))

  val a = Money(2, 50)
  val b = Money(0, 75)

  val sum = a + b
  assert(sum == Money(3, 25))

  val diff = a - b
  assert(diff == Money(1, 75))

  assert(b < a)
}
