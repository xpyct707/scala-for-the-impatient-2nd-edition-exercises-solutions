package ch11

object Ex3 extends App {
  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString = s"$num/$den"

    private def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    private def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a %  b)
    private def abs(a: Int) = if (a < 0) -a else a

    def +(other: Fraction)
      = new Fraction(num * other.den + other.num * den, den * other.den)

    def -(other: Fraction)
      = new Fraction(num * other.den - other.num * den, den * other.den)

    def *(other: Fraction) = new Fraction(num * other.num, den * other.den)

    def /(other: Fraction) = new Fraction(num * other.den, den * other.num)

    override def equals(obj: scala.Any): Boolean = {
      val other = obj.asInstanceOf[Fraction]
      if (num == other.num) den == other.den else false
    }
  }
  assert(new Fraction(1,2).equals(new Fraction(2,4)))

  val a = new Fraction(1,2)
  val b = new Fraction(3,4)

  val sum = a + b
  assert(sum.equals(new Fraction(5,4)))

  val sub = a - b
  assert(sub.equals(new Fraction(-1,4)))

  val mul = a * b
  assert(mul.equals(new Fraction(3, 8)))

  val div = a / b
  assert(div.equals(new Fraction(4, 6)))
}
