package ch8

object Ex2 extends App {
  class SavingsAccount(initialBalance: Double) extends Ex1.BankAccount(initialBalance) {
    private var opsCount = 0

    override def deposit(amount: Double) = {
      val depositAmount = if (opsCount < 3) amount else amount - 1
      opsCount += 1
      super.deposit(depositAmount)
    }

    override def withdraw(amount: Double) = {
      val withdrawAmount = if (opsCount < 3) amount else amount + 1
      opsCount += 1
      super.withdraw(withdrawAmount)
    }

    def earnMonthlyInterest(yearRate: Double) = {
      opsCount = 0
      super.deposit(currentBalance * yearRate / 100 / 12)
    }
  }

  val savingsAccount = new SavingsAccount(100)
  assert(savingsAccount.deposit(10) == 110)
  assert(savingsAccount.deposit(10) == 120)
  assert(savingsAccount.withdraw(20) == 100)
  assert(savingsAccount.withdraw(20) == 79)
  assert(savingsAccount.deposit(10) == 88)

  assert(savingsAccount.earnMonthlyInterest(12) == 88.88)
  assert(savingsAccount.withdraw(74) == 14.88)
}
