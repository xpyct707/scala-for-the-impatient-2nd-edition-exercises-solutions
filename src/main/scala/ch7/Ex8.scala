package ch7

object Ex8 extends App {
  import java._
  import javax._

  println("All members of the packages are imported.")
  scala.Predef.print(
    "It's not a good idea because it can cause naming conflicts like in this code line.")
}
