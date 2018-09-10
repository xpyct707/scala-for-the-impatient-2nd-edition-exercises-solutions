package ch4

object ex7 extends App {
  import collection.JavaConverters._

  def printAllSystemProperties(): Unit = {
    val allProperties = System.getProperties.asScala
    val keyLong = allProperties.maxBy(_._1.length)._1.length + 1
    for (property <- System.getProperties.asScala) {
      println(f"${property._1}${" " * (keyLong - property._1.length)}| ${property._2}")
    }
  }
}
