package ch7

package object random {
  private val a = 1664525
  private val b = 1013904223
  private val c = Math.pow(2, 32)

  private var previousInt = 0
  private var previousDouble = 0.0

  def setSeed(seed: Int): Unit = {
    previousInt = seed
    previousDouble = seed
  }

  def nextDouble():Double = {
    previousDouble = (previousDouble * a + b) % c
    previousDouble
  }

  def nextInt():Int = {
    previousInt = ((previousInt * a + b) % c).asInstanceOf[Int]
    previousInt
  }

  def main(args: Array[String]): Unit = {
    for (i <- 0 until 10) {
      setSeed(i)
      for (i <- 0 until 5)
        println(nextInt())
    }

    for (i <- 0 until 10) {
      setSeed(i)
      for (j <- 0 until 5)
        println(nextDouble())
    }
  }
}
