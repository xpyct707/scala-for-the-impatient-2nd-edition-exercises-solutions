package ch10

class Account(initialBalance: Double) {
  protected var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = balance += amount
  def withdraw(amount: Double) = balance -= amount

  val newField = "newFieldValue"
}
