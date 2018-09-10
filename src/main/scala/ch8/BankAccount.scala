package ch8

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = super.deposit(amount - 1)
  override def withdraw(amount: Double): Double = super.withdraw(amount + 1)
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var opsCount = 0

  override def deposit(amount: Double): Double = {
    if (opsCount < 3) {
      super.deposit(amount)
    } else {
      super.deposit(amount + 1)
    }
    opsCount += 1
    currentBalance
  }

  override def withdraw(amount: Double): Double = {
    if (opsCount < 3) {
      super.withdraw(amount)
    } else {
      super.withdraw(amount + 1)
    }
    opsCount += 1
    currentBalance
  }

  def earnMonthlyInterest(yearRate: Double): Double = {
    super.deposit(currentBalance * yearRate / 12)
    opsCount = 0
    currentBalance
  }
}