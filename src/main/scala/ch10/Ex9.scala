package ch10

object Ex9 extends App {
  trait BufferedInputStreamLike extends java.io.InputStream {
    val bis = new java.io.BufferedInputStream(this)

    override def read(): Int = {
      bis.read()
    }
  }

  val bafInStream = new java.io.FileInputStream("ex9.txt") with BufferedInputStreamLike
  bafInStream.read()
}
