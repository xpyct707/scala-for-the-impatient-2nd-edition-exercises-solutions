package ch8

object Ex9 extends App {
  class Creature {
    def range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  class Ant extends Creature {
    override val range = 2
  }

  class FixedAnt extends Creature {
    override def range = 2
  }

  val creature = new Creature
  assert(creature.range == 10)
  assert(creature.env.length == 10)

  val ant = new Ant
  assert(ant.range == 2)
  assert(ant.env.length == 0)
  println("Using a val in the subclass doesn't fix the problem because" +
    " the subclass now has a private field which is still not initialized" +
    " when the superclass constructor is called. The constructor reads" +
    " the field through a getter method.")

  println()
  val fixedAnt = new FixedAnt
  assert(fixedAnt.range == 2)
  assert(fixedAnt.env.length == 2)
  println("When a def is used no field exists. So the superclass constructor" +
    " just calls the overridden 'range()' method and the array gets correct length.")
}
