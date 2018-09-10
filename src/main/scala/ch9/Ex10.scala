package ch9

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

object Ex10 extends App {
  val a = new Person("a")
  val b = new Person("b")
  val c = new Person("c")

  a.friends += (b, c)
  b.friends += a
  c.friends += b

  val all = Array(a, b, c)

  println("all:")
  all.foreach(p => println(p.friends))

  val fileName = "all.obj"
  val out = new ObjectOutputStream(new FileOutputStream(fileName))
  out.writeObject(all)
  out.close()

  val in = new ObjectInputStream(new FileInputStream(fileName))
  val allAgain = in.readObject.asInstanceOf[Array[Person]]
  in.close()
  println("all again:")
  allAgain.foreach(p => println(p.friends))
}

import java.io.{FileOutputStream, ObjectOutputStream}

import scala.collection.mutable.ArrayBuffer
class Person(val name: String) extends Serializable {
  val friends = new ArrayBuffer[Person] // OK—ArrayBuffer is serializable
  override def toString: String = name
}
