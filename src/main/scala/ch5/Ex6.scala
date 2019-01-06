package ch5

object Ex6 extends App {
  class Person(_age: Int) {
    age = if (_age < 0) 0 else _age
    var age = 0
  }

  val person = new Person(-5)
  assert(person.age == 0)
}
