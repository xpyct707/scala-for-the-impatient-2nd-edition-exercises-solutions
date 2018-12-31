package ch2

import scala.math.Numeric.LongIsIntegral

object Ex7 extends App {
//  println("Hello".product.toLong) doesn't work
//  println("Hello".product(LongIsIntegral)) doesn't work either
  println("Hello".map(_.toLong).product)
  println("Hello".foldLeft(1L)((x, c) => x * c))
}
