package ch2

object Ex1 extends App {
  def signum(x: Int) = if (x > 0) 1 else if (x < 0) -1 else 0

  assert(signum(-3) == -1)
  assert(signum(3) == 1)
  assert(signum(0) == 0)
}
