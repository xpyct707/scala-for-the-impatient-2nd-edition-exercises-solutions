package ch9

import java.io.PrintWriter

import scala.io.Source

object Ex2 extends App {
  def replaceTabsWithSpaces(filePath: String) {
    val in = Source.fromFile(filePath)
    val resultString = "\t".r.replaceAllIn(in.mkString, "  ")
    in.close
    val out = new PrintWriter(filePath)
    out.print(resultString)
    out.close()
  }

  replaceTabsWithSpaces("ex2.txt")
}
