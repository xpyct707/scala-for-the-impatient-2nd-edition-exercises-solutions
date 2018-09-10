package ch10

class SavingsAccount(initialBalance: Double) extends Account(initialBalance) with ConsoleLogger {
  override def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}
