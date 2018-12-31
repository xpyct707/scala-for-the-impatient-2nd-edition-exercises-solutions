package ch2

import java.time.{DateTimeException, LocalDate}

object Ex11 extends App {
  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) throw new IllegalArgumentException(
        s"3 arguments expected, but ${args.length} was found.")

      val year = args(0).toString.toInt
      val month = args(1).toString.toInt
      val day = args(2).toString.toInt
      try {
        LocalDate.of(year, month, day)
      } catch {
        case _: DateTimeException => throw new IllegalArgumentException(
          s"Couldn't create a local date from year=$year month=$month day=$day")
      }
    }
  }

  var year = 2018
  var month = 12
  var day = 31
  println(date"$year-$month-$day")

  year = 2018
  month = 12
  day = 32
  date"$year-$month-$day"
}
