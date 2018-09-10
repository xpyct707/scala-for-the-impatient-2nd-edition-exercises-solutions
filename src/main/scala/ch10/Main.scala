package ch10

object Main extends App {
  val sa = new SavingsAccount(100)
  println(sa.currentBalance)
  println(sa.newField)
  println(sa.logField)
}
