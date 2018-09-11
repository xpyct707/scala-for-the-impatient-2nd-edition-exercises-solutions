package ch12

object Ex10 extends App {
  def unless(condition: Boolean)(block: => Unit): Unit = {
    if (!condition) block
  }

  val x = 5
  unless(x > 0) {
    println(x)
  }
}
