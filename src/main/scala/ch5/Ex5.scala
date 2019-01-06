package ch5

object Ex5 extends App {
  import scala.beans.BeanProperty
  class Student(@BeanProperty var name: String,
                @BeanProperty var id: Long) {}

  val student = new Student("xpyct", 707)
  assert(student.id == 707)
  assert(student.getId == 707)
  assert(student.name == "xpyct")
  assert(student.getName == "xpyct")

  student.setId(100500)
  assert(student.id == 100500)
  assert(student.getId == 100500)

  student.setName("RSV")
  assert(student.name == "RSV")
  assert(student.getName == "RSV")
}
