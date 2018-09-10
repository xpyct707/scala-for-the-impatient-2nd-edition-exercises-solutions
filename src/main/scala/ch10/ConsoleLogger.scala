package ch10

trait ConsoleLogger extends Logger{
  val logField = "logFieldValue"
  def log(msg: String) {
    println(msg)
  }
}