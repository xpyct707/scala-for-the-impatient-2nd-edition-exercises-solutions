package ch11

import scala.collection.mutable.ArrayBuffer

object Ex5 extends App {
  class Table {
    private val _rows = ArrayBuffer[ArrayBuffer[String]]()
    _rows += ArrayBuffer[String]()

    def |(td: String): Table = {
      _rows.last += td
      this
    }

    def ||(td: String): Table = {
      val newRow = ArrayBuffer[String]()
      newRow += td
      _rows += newRow
      this
    }

    //<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
    override def toString: String = {
      val result = new StringBuilder()
      for (row <- _rows) {
        result ++= row.mkString("\n\t<tr>\n\t\t<td>", "</td>\n\t\t<td>", "</td>\n\t</tr>")
      }
//      _rows.foreach(row => result ++= row.mkString("\n\t<tr>\n\t\t<td>", "</td>\n\t\t<td>", "</td>\n\t</tr>"))

      s"<table>$result\n</table>"
    }
  }
  object Table {
    def apply(): Table = new Table()
  }

  val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  println(table)
}
