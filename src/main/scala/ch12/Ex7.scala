package ch12

object Ex7 extends App {
  def adjustToPair(fun: (Int, Int) => Int): Tuple2[Int, Int] => Int = {
    pair => fun(pair._1, pair._2)
  }

  println(adjustToPair(_ * _)((6,7)))
  println(adjustToPair(_ + _)((6,7)))
}
