package ch4

object ex6 extends App {

  import java.util.Calendar._

  import scala.collection.mutable.LinkedHashMap

  def printWeekday(): Unit = {
    val weekdaysMap = LinkedHashMap(
      "Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY,
      "Sunday" -> SUNDAY
    )
    println(weekdaysMap)
  }
}
