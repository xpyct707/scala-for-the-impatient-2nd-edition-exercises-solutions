package ch9

import java.io.File
import java.nio.file.Paths

import scala.io.Source

object Ex3 extends App {
  def printAndGetWordsByLength(file: File, maxLength: Int) = {
    val result = new StringBuffer
    Source.fromFile(file).mkString.split("\\s+").foreach(
      word => if (word.length > maxLength) {
          println(word)
          result.append(word).append('\n')
      }
    )
    result.toString
  }

  val sourceFile = Paths.get("src", "main", "resources", "ch9", "ex3.txt").toFile
  assert(printAndGetWordsByLength(sourceFile, 12) == "13cbnbvqcwert\n15qwerlkjhgmnbvc\n")
}
