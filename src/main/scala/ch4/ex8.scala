package ch4

object ex8 extends App {
  def minmax(values: Array[Int]) = (values.min, values.max)

  assert(minmax(Array(1, 0, -1)) == (-1, 1))
  assert(minmax(Array(0)) == (0, 0))
}
