package ch5

class Person2(fullName: String) {
  private val SPACE = " "
  if (fullName.isEmpty || !fullName.contains(SPACE)) throw new IllegalArgumentException
  val firstName = fullName.substring(0, fullName.indexOf(SPACE))
  val lastName = fullName.substring(fullName.indexOf(SPACE) + 1)
}
