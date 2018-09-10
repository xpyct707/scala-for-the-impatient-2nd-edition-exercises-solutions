package ch9

import java.io.{FileWriter, PrintWriter}

import scala.io.Source

object Ex4 extends App {
  def appendStatisticsToFile(fileName: String) {
    val in = Source.fromFile(fileName)
    val numbers = in.mkString.split("\\s+").map(_.toDouble)
    in.close()

    val out = new PrintWriter(new FileWriter(fileName, true))
    out.append(f"sum: ${numbers.sum}\n")
    out.append(f"average: ${numbers.sum / numbers.length}\n")
    out.append(f"min: ${numbers.min}\n")
    out.append(f"max: ${numbers.max}\n")
    out.close()
  }

  appendStatisticsToFile("ex4.txt")
}
