package ch5

object Ex7 extends App {
  class Person(fullName: String) {
    private val SPACE = " "
    if (fullName.isEmpty || !fullName.contains(SPACE)) throw new IllegalArgumentException
    val firstName = fullName.substring(0, fullName.indexOf(SPACE))
    val lastName = fullName.substring(fullName.indexOf(SPACE) + 1)
  }

  val person = new Person("Fred Smith")
  assert(person.firstName == "Fred")
  assert(person.lastName == "Smith")
}
