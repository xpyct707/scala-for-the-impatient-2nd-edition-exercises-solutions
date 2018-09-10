package ch9

import scala.io.Source

object Ex3 extends App {
  def printLongWords(fileName: String) {
    Source.fromFile(fileName).mkString.split("\\s+")
      .foreach(word => if (word.length > 6) println(word))
  }

  printLongWords("ex3.txt")
}
