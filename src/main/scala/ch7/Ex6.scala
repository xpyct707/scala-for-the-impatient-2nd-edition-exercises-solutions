package ch7

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}
import scala.collection.JavaConverters._

object Ex6 {
  def convertToScalaMap(javaMap: JavaHashMap[String, Int]): ScalaHashMap[String, Int] = {
    val result = new ScalaHashMap[String, Int]
    for (e <- javaMap.asScala) {
      result += e
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val javaMap = new JavaHashMap[String, Int]
    javaMap.put("q", 1)
    javaMap.put("w", 2)
    javaMap.put("e", 3)

    println(convertToScalaMap(javaMap))
  }
}
