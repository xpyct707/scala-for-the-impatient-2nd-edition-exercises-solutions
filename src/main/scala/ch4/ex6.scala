package ch4

object ex6 extends App {
  import java.util.Calendar._
  import scala.collection.mutable

  def printWeekday(): Unit = {
    val weekdaysMap = mutable.LinkedHashMap(
      "Saturday" -> SATURDAY,
      "Monday" -> MONDAY,
      "Wednesday" -> WEDNESDAY,
      "Tuesday" -> TUESDAY,
      "Friday" -> FRIDAY,
      "Sunday" -> SUNDAY,
      "Thursday" -> THURSDAY
    )
    for ((d, c) <- weekdaysMap) println(s"$d: $c")
  }

  printWeekday()
}
