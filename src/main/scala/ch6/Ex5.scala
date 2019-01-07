package ch6

object Ex5 extends App {
  object Reverse extends App {
    for (arg <- args.reverse) print(arg + " ")
  }

  Reverse.main(Array("Hello", "World"))
}
