package ch8

class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

object Test extends App {
  val creature = new Creature
  println(creature.range)
  println(creature.env.length)

  val ant = new Ant
  println(ant.range)
  println(ant.env.length)
}
