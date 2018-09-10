package ch5

class BankAccount {
  private var _balance = 0L

  def balance = _balance

  def deposit(sum: Long) {
    if (sum > 0) _balance += sum
    else throw new IllegalArgumentException("Sum must be more than 0")
  }

  def withdraw (sum: Long): Unit = {
    if (sum > _balance) throw new IllegalArgumentException("Sum can't be more than balance")
    else _balance -= sum
  }
}
