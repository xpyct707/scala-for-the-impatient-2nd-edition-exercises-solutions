package ch8

object Ex3 extends App {
  class Employee(val name: String, var salary: Double)

  class Manager(name: String, salary: Double, val subordinates: List[Employee])
    extends Employee(name, salary)

  class Executive(name: String, salary: Double, subordinates: List[Employee],
                  var bonus: Double)
    extends Manager(name, salary, subordinates)

  class Secretary(name: String, salary: Double, var executive: Executive)
    extends Employee(name, salary)

  val sergey = new Employee("Sergey", 100)
  val valentin = new Employee("Valentin", 200)
  val michael = new Employee("Michael", 300)

  val manager = new Manager("Ivan", 1000, List(sergey, valentin, michael))
  val executive = new Executive("Oleg", 2000, List(manager, secretary), 100500)
  lazy val secretary: Secretary = new Secretary("Irina", 700, executive)
}
