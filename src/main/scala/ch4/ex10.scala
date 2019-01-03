package ch4

object ex10 extends App {
  def printChessBoard(): Unit = {
    val letters = "ABCDEFGH"
    for (i <- 8 to 1 by -1) {
      println(letters.zip(i.toString * 8))
    }
  }

  printChessBoard()
}
