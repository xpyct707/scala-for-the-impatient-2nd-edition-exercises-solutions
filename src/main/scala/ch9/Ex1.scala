package ch9

import java.io.{File, PrintWriter}

import scala.io.Source

object Ex1 extends App {
  val fileName = "ex1.txt"
  val source = Source.fromFile(fileName)
  val lines = source.getLines.toBuffer
  source.close()
  val out = new PrintWriter(fileName)
  lines.reverse.foreach(out.println)
  out.close()
}
