package ch5

object Ex10 extends App {
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

  var employee = new Employee
  assert(employee.name == "John Q. Public")
  assert(employee.salary == 0)

  employee = new Employee("John Doe", 100500)
  assert(employee.name == "John Doe")
  assert(employee.salary == 100500)
}
