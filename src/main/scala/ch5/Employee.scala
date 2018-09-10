package ch5

class Employee {
  private var _name = "John Q. Public"
  var salary = 0.0

  def this(name: String, salary: Double) {
    this
    _name = name
    this.salary = salary
  }

  def name = _name
}
