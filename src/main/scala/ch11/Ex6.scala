package ch11

import scala.collection.mutable.ArrayBuffer

object Ex6 extends App {
  class ASCIIArt(private val _content: Array[String]) {
    def +|(other: ASCIIArt): ASCIIArt = {
      val equalPartLength = Array(_content.length, other._content.length).min
      val thisWidth = _content.maxBy(_.length).length + 1
      var result = concatenateEqualPart(other._content, equalPartLength, thisWidth)
      if (_content.length > other._content.length) {
        for (i <- equalPartLength until _content.length) {
          result += _content(i)
        }
      } else if (_content.length < other._content.length) {
        for (i <- _content.length until other._content.length) {
          result += " " * thisWidth + other._content(i)
        }
      }
      new ASCIIArt(result.toArray)
    }

    private def concatenateEqualPart(otherContent: Array[String],
                                      equalPartLength: Int, thisWidth: Int): ArrayBuffer[String] = {
      val result = new ArrayBuffer[String](equalPartLength)
      for (i <- 0 until equalPartLength) {
        val currentLine = _content(i)
        val additionalSpacesNumber = thisWidth - currentLine.length
        result += currentLine + " " * additionalSpacesNumber + otherContent(i)
      }
      result
    }

    def ±(other: ASCIIArt): ASCIIArt = {
      val result = new ArrayBuffer[String](_content.length + other._content.length)
      result ++= _content
      result ++= other._content
      new ASCIIArt(result.toArray)
    }

    override def toString: String = _content.mkString("\n")
  }

  object ASCIIArt {
    def apply(picture: String): ASCIIArt = {
      new ASCIIArt(picture.split('\n'))
    }
  }

  val fig1 = ASCIIArt(" /\\_/\\\n( ' ' )\n(  -  )\n | | |\n(__|__)")
  val fig2 = ASCIIArt("   -----\n / Hello \\\n<  Scala |\n \\ Coder /\n   -----")
  println(fig1)
  println(fig2)
  println()
  println(fig1 +| fig2)

  val fig3 = ASCIIArt(" /\\_/\\\n     \n( ' ' )\n(  -  )\n     \n | | |\n(__|__)")
  println()
  println(fig3 +| fig2)
  println()
  println(fig1 +| fig3)
  println()
  println(fig1 ± fig2)
}
