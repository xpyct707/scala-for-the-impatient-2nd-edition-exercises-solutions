package ch10

object Ex10 extends App {
  trait BufferedInputStreamLike extends java.io.InputStream with Logger {
    val bis = new java.io.BufferedInputStream(this)

    override def read(): Int = {
      val bytes = bis.read()
      log(bytes.toString)
      bytes
    }
  }

  val bafInStream = new java.io.FileInputStream("ex10.txt") with BufferedInputStreamLike with ConsoleLogger
  bafInStream.read()
}
