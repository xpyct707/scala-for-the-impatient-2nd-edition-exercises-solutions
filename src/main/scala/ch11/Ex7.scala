package ch11

object Ex7 extends App {
  import java.lang.Long
  class BitSequence(sequence: String) {
    private var _packedSequence = Long.parseLong(sequence, 2)

    def apply(bit: Int): Int = {
      _packedSequence.toBinaryString.charAt(bit).asDigit
    }

    def update(bit: Int, value: Int) {
      val unpackedSequence = _packedSequence.toBinaryString.toCharArray
      unpackedSequence(bit) = if (value == 0) '0' else '1'
      _packedSequence = Long.parseLong(unpackedSequence.mkString, 2)
    }

    override def toString: String = _packedSequence.toBinaryString
  }

  object BitSequence {
    def apply(sequence: String): BitSequence = new BitSequence(sequence)
  }

  val input = "1"*15 + "0"*25 + "1"*12 + "0"*11
  println(input)
  val bs = BitSequence(input)
  println(bs)
  println(f"3=${bs(3)}, 22=${bs(22)}, 45=${bs(45)}")
  bs(5) = 0
  bs(37) = 1
  println(bs)
}
