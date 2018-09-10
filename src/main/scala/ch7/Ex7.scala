package ch7

object Ex7 {
  import java.util.{HashMap => JavaHashMap}
  import scala.collection.mutable.{HashMap => ScalaHashMap}
  def convertToScalaMap(javaMap: JavaHashMap[String, Int]): ScalaHashMap[String, Int] = {
    val result = new ScalaHashMap[String, Int]
    import scala.collection.JavaConverters._
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
