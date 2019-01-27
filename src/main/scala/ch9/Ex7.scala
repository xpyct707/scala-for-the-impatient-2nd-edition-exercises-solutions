package ch9

import java.nio.file.Paths

import scala.io.Source

object Ex7 extends App {
  private val floatingPattern = """[+-]?(\d+)\.\d+""".r
  val in = Source.fromFile(Paths.get("src", "main", "resources", "ch9", "ex7.txt").toFile)
  floatingPattern.split(in.mkString).foreach(println)
  in.close
}
