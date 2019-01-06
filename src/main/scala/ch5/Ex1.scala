package ch5

object Ex1 extends App {
  class Counter {
    private var value = 0L

    def increment() {
      value += 1
    }

    def current = value
  }

  val counter = new Counter
  for (i <- 0 to Int.MaxValue) counter.increment()

  assert(counter.current == 2147483648L)
}
