package ch9

import java.io.{File, FileWriter, PrintWriter}
import java.nio.file.{Files, Paths}

import scala.io.Source

object Ex4 extends App {
  def appendStatisticsToFile(inputFile: File, targetFile: File) {
    val in = Source.fromFile(inputFile)
    val lines = in.getLines.toArray
    val numbers = lines.mkString.split("\\s+").map(_.toDouble)
    in.close()

    val out = new PrintWriter(targetFile)
    Files.createDirectories(targetFile.getParentFile.toPath)
    lines.foreach(out.println)
    out.println(f"sum: ${numbers.sum}")
    out.println(f"average: ${numbers.sum / numbers.length}")
    out.println(f"min: ${numbers.min}")
    out.println(f"max: ${numbers.max}")
    out.close()
  }

  val source = Paths.get("src", "main", "resources", "ch9", "ex4.txt").toFile
  val target = Paths.get("target", "out", "ch9", "ex4.txt").toFile
  appendStatisticsToFile(source, target)
}
