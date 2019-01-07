package ch6

object Ex7 extends App {
  import Ex6.CardSuit

  def isRed(value: CardSuit.Value) = {
    value.id < 2
  }

  for (s <- CardSuit.values) println(s + " " + isRed(s))
}
