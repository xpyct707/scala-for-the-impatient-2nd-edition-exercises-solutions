package ch9

import java.io.{File, PrintWriter}
import java.nio.file.Paths

import scala.io.Source

object Ex2 extends App {
  def replaceTabsWithSpaces(file: File) {
    val resultString = "\t".r.replaceAllIn(readFile(file), "  ")
    val out = new PrintWriter(file)
    out.print(resultString)
    out.close()
  }

  def readFile(file: File) = {
    val source = Source.fromFile(file)
    val result = source.mkString
    source.close()
    result
  }

  val sourceFile = Paths.get("src", "main", "resources", "ch9", "ex2.txt").toFile
  assert(readFile(sourceFile).contains("\t"))
  replaceTabsWithSpaces(sourceFile)
  assert(!readFile(sourceFile).contains("\t"))
}
