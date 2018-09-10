package ch4

object ex3 extends App {
  def getWordFrequencyMap(pathToFile: String) = {
    val in = new java.util.Scanner(new java.io.File(pathToFile))
    var wordsMap = collection.immutable.Map[String, Int]()
    while (in.hasNext) {
      val word = in.next
      wordsMap += (word -> (wordsMap.getOrElse(word, 0) + 1))
    }
    wordsMap
  }
}
