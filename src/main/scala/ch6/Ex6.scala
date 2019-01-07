package ch6

object Ex6 extends App {
  object CardSuit extends Enumeration {
    val Diamonds = Value("\u2666")
    val Hearts = Value("\u2665")
    val Clubs = Value("\u2663")
    val Spades = Value("\u2660")
  }

  for (s <- CardSuit.values) println(s)
}
