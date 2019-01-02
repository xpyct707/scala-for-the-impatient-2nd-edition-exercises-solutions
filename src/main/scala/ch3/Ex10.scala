package ch3

import java.util.TimeZone

object Ex10 extends App {
  val allTimeZones = TimeZone.getAvailableIDs
  val americaPrefix = "America/"
  println(allTimeZones
    .filter(_.startsWith(americaPrefix))
    .map(_.substring(americaPrefix.length))
    .sorted
    .mkString("\n"))
}
