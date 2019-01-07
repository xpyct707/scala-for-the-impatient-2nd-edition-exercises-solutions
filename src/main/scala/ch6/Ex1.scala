package ch6

object Ex1 extends App {
  object Conversions {
    def inchesToCentimeters(inches: Double) = {
      inches * 2.54
    }

    def gallonsToLiters(gallons: Double) = {
      gallons * 3.785411784
    }

    def milesToKilometers(miles: Double) = {
      miles * 1.609344
    }
  }

  assert(Conversions.inchesToCentimeters(1) == 2.54)
  assert(Conversions.gallonsToLiters(1) == 3.785411784)
  assert(Conversions.milesToKilometers(1) == 1.609344)
}
