package ch9

import java.nio.file.Paths

import scala.io.Source

object Ex6 extends App {
  private val quotedStringPattern = """((?<!\\)"|(?<=\\{2})").*?\1""".r
  val in = Source.fromFile(Paths.get("src", "main", "resources", "ch9", "ex6.txt").toFile)
  quotedStringPattern.findAllIn(in.mkString).foreach(println)
  in.close
}
