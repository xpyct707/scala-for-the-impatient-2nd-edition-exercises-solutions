package ch8

object Ex1 extends App {
  class BankAccount(initialBalance: Double) {
    import scala.math.BigDecimal.RoundingMode

    private var balance = initialBalance

    def currentBalance = balance
    def deposit(amount: Double) = {balance = round(balance + amount); balance}

    private def round(amount: Double)
      = BigDecimal(amount).setScale(2, RoundingMode.HALF_UP).toDouble

    def withdraw(amount: Double) = {balance = round(balance - amount); balance }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = super.deposit(amount - 1)
    override def withdraw(amount: Double) = super.withdraw(amount + 1)
  }

  val checkingAccount = new CheckingAccount(100)
  assert(checkingAccount.deposit(10) == 109)
  assert(checkingAccount.withdraw(10) == 98)
}
