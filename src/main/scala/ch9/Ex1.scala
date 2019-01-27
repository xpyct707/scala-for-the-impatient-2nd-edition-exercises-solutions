package ch9

import java.io.{File, PrintWriter}
import java.nio.file.{Files, Paths}

import scala.io.Source

object Ex1 extends App {
  val source = Source.fromFile(Paths.get("src", "main", "resources", "ch9", "ex1.txt").toFile)
  val lines = source.getLines.toArray
  source.close()
  val resultFile = Paths.get("target", "out", "ch9", "ex1.txt").toFile
  Files.createDirectories(resultFile.getParentFile.toPath)
  val out = new PrintWriter(resultFile)
  lines.reverse.foreach(out.println)
  out.close()
  val expected
    = lines.reverse.mkString("", System.lineSeparator(), System.lineSeparator())
  assert(
    Source.fromFile(resultFile).mkString == expected)
}
