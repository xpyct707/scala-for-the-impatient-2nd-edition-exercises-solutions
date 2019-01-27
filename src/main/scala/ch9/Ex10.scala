package ch9

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}
import java.nio.file.Paths

object Ex10 extends App {
  val a = new Person("a")
  val b = new Person("b")
  val c = new Person("c")

  a.friends += (b, c)
  b.friends += a
  c.friends += b

  val all = Array(a, b, c)
  val printAllFriends = (people: Array[Person]) =>
    people.foreach(p => println(s"${p.name} friends: " + p.friends.mkString(", ")))
  printAllFriends(all)

  val outFile = Paths.get("target", "out", "ch9", "ex10.obj").toFile
  val out = new ObjectOutputStream(new FileOutputStream(outFile))
  out.writeObject(all)
  out.close()

  val in = new ObjectInputStream(new FileInputStream(outFile))
  val allAgain = in.readObject.asInstanceOf[Array[Person]]
  in.close()
  printAllFriends(allAgain)
}

import java.io.{FileOutputStream, ObjectOutputStream}

import scala.collection.mutable.ArrayBuffer
class Person(val name: String) extends Serializable {
  val friends = new ArrayBuffer[Person] // OK—ArrayBuffer is serializable
  override def toString: String = name
}
