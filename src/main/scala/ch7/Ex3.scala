package ch7

import ch7.random.{nextDouble, nextInt, setSeed}

object Ex3 extends App {
  for (i <- 0 until 10) {
    setSeed(i)
    for (i <- 0 until 5) println(nextInt())
  }

  for (i <- 0 until 10) {
    setSeed(i)
    for (j <- 0 until 5) println(nextDouble())
  }
}
