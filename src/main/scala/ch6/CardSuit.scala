package ch6

object CardSuit extends Enumeration {
  val Diamonds = Value("\u2666")
  val Hearts = Value("\u2665")
  val Clubs = Value("\u2663")
  val Spades = Value("\u2660")

  def isRed(value: Value) = {
    value.id < 2
  }
}

object Test extends App {
  for (s <- CardSuit.values) println(s + " " + CardSuit.isRed(s))
}
