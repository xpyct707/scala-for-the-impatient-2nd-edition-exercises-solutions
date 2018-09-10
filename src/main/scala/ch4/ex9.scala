package ch4

object ex9 extends App {
  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }
}
