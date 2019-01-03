package ch4

object ex9 extends App {
  def lteqgt(values: Array[Int], v: Int)
    = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

  assert(lteqgt(Array(-1, 0, 1), 0) == (1, 1, 1))
  assert(lteqgt(Array(-2, -1, 0, 1, 2), -3) == (0, 0, 5))
}
