package ch2

object Ex10 extends App {
  def power(x: Double, n: Int):Double = {
    if (n == 0) 1
    else if (n < 0) 1 / power(x, -n)
    else if (n % 2 == 0) power(x, n / 2) * power(x, n / 2)
    else x * power(x, n - 1)
  }

  assert(power(0, 0) == 1)
  assert(power(0, 1) == 0)
  assert(power(1, -1) == 1)
  assert(power(1, 0) == 1)
  assert(power(1, 1) == 1)
  assert(power(1, 2) == 1)
  assert(power(2, -2) == 0.25)
  assert(power(2, 2) == 4)
}
