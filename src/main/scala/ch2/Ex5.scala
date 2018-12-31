package ch2

object Ex5 extends App {
  def countdown(n: Int) {for (i <- n to 0 by -1) println(i)}
  countdown(20)
}
