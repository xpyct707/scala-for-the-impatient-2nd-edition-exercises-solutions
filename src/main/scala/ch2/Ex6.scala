package ch2

object Ex6 extends App {
  var r:Long = 1
  for (c <- "Hello") r *= c
  println(r)
}
