package ch10

object Ex4 extends App {
  trait Logger {
    def log(msg: String)
  }

  class ConsoleLogger extends Logger {
    override def log(msg: String) = println(msg)
  }

  trait CryptoLogger extends ConsoleLogger {
    var key = 3
    override def log(msg: String) = {
      super.log(msg.map(char => (char + key).toChar))
    }
  }

  val logger = new ConsoleLogger with CryptoLogger
  logger.log("123")
  logger.key = -3
  logger.log("456")
}
