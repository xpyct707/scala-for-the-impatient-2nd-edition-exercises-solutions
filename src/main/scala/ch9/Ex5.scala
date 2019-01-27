package ch9

import java.io.{File, PrintWriter}
import java.nio.file.{Files, Paths}
import java.text.DecimalFormat

object Ex5 extends App {
  def printPowers(number: Int, targetFile: File) {
    val maxLength = Math.pow(2, number).toString.length
    val formatter = new DecimalFormat("#." + "#" * number)
    Files.createDirectories(targetFile.getParentFile.toPath)
    val out = new PrintWriter(targetFile)
    for (i <- 0 until number) {
      val power = Math.pow(2, i)
      val startPoint = maxLength - power.toString.length
      out.println(" " * startPoint + f"${power.asInstanceOf[Int]}    " +
        f"${formatter.format(1 / power)}")
    }
    out.close()
  }

  val targetFile = Paths.get("target", "out", "ch9", "ex5.txt").toFile
  printPowers(20, targetFile)
}
