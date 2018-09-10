package ch9

import java.text.DecimalFormat

object Ex5 extends App {
  val maxLength = Math.pow(2, 20).toString.length
  val formatter = new DecimalFormat("#." + "#" * 20)
  for (i <- 0 to 20) {
    val power = Math.pow(2, i)
    val startPoint = maxLength - power.toString.length
    println(" " * startPoint + f"${power.asInstanceOf[Int]}    " +
      f"${formatter.format(1 / power)}")
  }
}
