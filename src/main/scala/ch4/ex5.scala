package ch4

object ex5 extends App {
  import collection.JavaConverters._

  def getWordFrequencyMap(pathToFile: String) = {
    val in = new java.util.Scanner(new java.io.File(pathToFile))
    var wordsMap : collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int].asScala
    while (in.hasNext) {
      val word = in.next
      wordsMap += (word -> (wordsMap.getOrElse(word, 0) + 1))
    }
    wordsMap
  }
}
