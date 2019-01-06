package ch5

object Ex2 extends App {
  class BankAccount {
    private var _balance = 0L

    def balance = _balance

    def deposit(sum: Long) {
      if (sum > 0) _balance += sum
      else throw new IllegalArgumentException("Sum must be more than 0")
    }

    def withdraw (sum: Long) = {
      if (sum > _balance) throw new IllegalArgumentException("Sum can't be more than balance")
      else _balance -= sum
    }
  }

  val account = new BankAccount
  assert(account.balance == 0)

  account.deposit(100)
  assert(account.balance == 100)

  account.withdraw(50)
  assert(account.balance == 50)
}
