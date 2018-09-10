package ch9

import scala.io.Source

object Ex7 extends App {
  private val floatingPattern = """[+-]?(\d+)\.\d+""".r
  val fileSource = Source.fromFile("ex7.txt")
  floatingPattern.split(fileSource.mkString).foreach(println)
  fileSource.close
}
