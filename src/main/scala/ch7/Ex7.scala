package ch7

object Ex7 extends App {
  import java.util.{LinkedHashMap => JavaLinkedHashMap}
  def convertToScalaMap(javaMap: JavaLinkedHashMap[String, Int])= {
    import scala.collection.mutable.{LinkedHashMap => ScalaLinkedHashMap}
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
  import scala.collection.mutable.{LinkedHashMap => ScalaLinkedHashMap}
  assert(scalaMap sameElements ScalaLinkedHashMap(("q", 1), ("w", 2), ("e", 3)))
}
