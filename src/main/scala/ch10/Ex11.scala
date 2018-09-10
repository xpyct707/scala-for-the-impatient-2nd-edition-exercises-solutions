package ch10

object Ex11 extends App {
  trait IterableInputStream extends java.io.InputStream with Iterable[Byte] {
    override def iterator: Iterator[Byte] = new Iterator[Byte] {
      override def hasNext: Boolean = available() != 0

      override def next(): Byte = read().toByte
    }
  }

  import java.io.FileInputStream
  val fileStreamIterator
    = (new FileInputStream("ex11.txt") with IterableInputStream).iterator

  while (fileStreamIterator.hasNext) println(fileStreamIterator.next)

/*
  import java.io.InputStream

  class IterableInputStream(is: InputStream) extends InputStream with Iterable[Byte] {
    override def read(): Int = is.read()

    override def iterator: Iterator[Byte] = new Iterator[Byte] {
      override def hasNext: Boolean = is.available() != 0

      override def next(): Byte = is.read().toByte
    }
  }

  import java.io.FileInputStream
  val fileStreamIterator
  = new IterableInputStream(new FileInputStream("ex11.txt")).iterator

  while (fileStreamIterator.hasNext) println(fileStreamIterator.next)
*/
}
