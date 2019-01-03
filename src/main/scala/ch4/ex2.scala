package ch4

object ex2 extends App {
  val in = new java.util.Scanner(new java.io.File(sourceFilePath))
  val wordsMap = collection.mutable.Map[String, Int]()
  while (in.hasNext) {
    val word = in.next
    wordsMap.update(word, wordsMap.getOrElse(word, 0) + 1)
  }
  println(wordsMap)
}
