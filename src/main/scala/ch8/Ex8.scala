package ch8

object Ex8 extends App {
  class Person(val name: String) {
    override def toString = s"${getClass.getName}[name=$name]"
  }

  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret" // Don't want to reveal name ...
    override val toString = "secret" // ... or class name
  }

  println("javap -p -c Ex8$Person")
  println("public class ch8.Ex8$Person {")
  println("\tprivate final java.lang.String name;")
  println("\tpublic java.lang.String name();")
  println("\t\tCode:")
  println("\t\t\t0: aload_0")
  println("\t\t\t1: getfield      #13                 // Field name:Ljava/lang/String;")
  println("\t\t\t4: areturn")
  println("\tpublic java.lang.String toString();")
  println("\tpublic ch8.Ex8$Person(java.lang.String);")
  println("}")
  println()
  println("javap -p -c Ex8$SecretAgent")
  println("public class ch8.Ex8$SecretAgent extends ch8.Ex8$Person {")
  println("\tprivate final java.lang.String name;")
  println("\tprivate final java.lang.String toString;")
  println("\tpublic java.lang.String name();")
  println("\t\tCode:")
  println("\t\t\t0: aload_0")
  println("\t\t\t1: getfield      #15                 // Field name:Ljava/lang/String;")
  println("\t\t\t4: areturn")
  println("\tpublic java.lang.String toString();")
  println("\tpublic ch8.Ex8$SecretAgent(java.lang.String);")
  println("}")
}
