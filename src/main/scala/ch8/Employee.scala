package ch8

class Employee(val name: String, var salary: Double)

import collection.mutable.MutableList
class Manager(name: String, salary: Double, val subordinates: MutableList[Employee])
  extends Employee(name, salary)

class Executive(name: String, salary: Double, subordinates: MutableList[Employee],
                var bonus: Double)
  extends Manager(name, salary, subordinates)

class Secretary(name: String, salary: Double, var exrcutive: Executive)
  extends Employee(name, salary)