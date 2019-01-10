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

  println("javap -p Ex5$Student")
  println("public class ch5.Ex5$Student {")
  println("\tprivate java.lang.String name;")
  println("\tprivate long id;")
  println("\tpublic java.lang.String name();")
  println("\tpublic void name_$eq(java.lang.String);")
  println("\tpublic long id();")
  println("\tpublic void id_$eq(long);")
  println("\tpublic long getId();")
  println("\tpublic java.lang.String getName();")
  println("\tpublic void setId(long);")
  println("\tpublic void setName(java.lang.String);")
  println("\tpublic ch5.Ex5$Student(java.lang.String, long);")
  println("}")
  println()
  println("Yes, you can. But there is no need to do that.")
}
