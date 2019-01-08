package ch7

import java.util.{LinkedHashMap => JavaLinkedHashMap}
import scala.collection.mutable.{LinkedHashMap => ScalaLinkedHashMap}

object Ex6 extends App {
  def convertToScalaMap(javaMap: JavaLinkedHashMap[String, Int])= {
    val result = new ScalaLinkedHashMap[String, Int]
    val iterator = javaMap.entrySet().iterator
    while (iterator.hasNext) {
      val entry = iterator.next
      result += (entry.getKey -> entry.getValue)
    }
    result
  }

  val javaMap = new JavaLinkedHashMap[String, Int]
  javaMap.put("q", 1)
  javaMap.put("w", 2)
  javaMap.put("e", 3)

  val scalaMap = convertToScalaMap(javaMap)
  assert(scalaMap sameElements ScalaLinkedHashMap(("q", 1), ("w", 2), ("e", 3)))
}
