package ch6

object Ex2 extends App {
  abstract class UnitConversion {
    def convert(x:Double):Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(inches: Double) = inches * 2.54
  }

  object GallonsToLiters extends UnitConversion {
    override def convert(gallons: Double) = gallons * 3.785411784
  }

  object MilesToKilometers extends UnitConversion {
    override def convert(miles: Double) = miles * 1.609344
  }

  def convert(unitConversion: UnitConversion, x: Double) = {
    unitConversion.convert(x)
  }

  assert(convert(InchesToCentimeters, 1) == 2.54)
  assert(convert(GallonsToLiters, 1) == 3.785411784)
  assert(convert(MilesToKilometers, 1) == 1.609344)
}
