package ch9

import scala.io.Source

object Ex6 extends App {
  private val quotedStringPattern = """((?<!\\)"|(?<=\\{2})").*?\1""".r
  val in = Source.fromFile("ex6.txt")
  quotedStringPattern.findAllIn(in.mkString).foreach(println)
  in.close
}
