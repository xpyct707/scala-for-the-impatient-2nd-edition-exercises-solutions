package ch12

object Ex6 extends App {
  def largestAt(fun: Int => Int, inputs: Seq[Int]): Int = {
    inputs.map(input => Tuple2(input, fun(input))).maxBy(_._2)._1
  }

  println(largestAt(x => 10 * x - x * x, 1 to 10))
}
