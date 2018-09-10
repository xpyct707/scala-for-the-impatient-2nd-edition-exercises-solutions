package ch11

object Ex8 extends App {
  class Matrix(private val _matrixArray: Array[Array[Double]]) {
    override def toString: String = {
      val result = new StringBuilder()
      _matrixArray.foreach(row => result ++= row.mkString(" ") + "\n")
      result.toString()
    }

    def apply(row: Int, col: Int): Double = {
      _matrixArray(row)(col)
    }

    def +(other: Matrix): Matrix = {
      operate(this, other, (x, y) => x + y)
    }

    def *(other: Matrix): Matrix = {
      operate(this, other, (x, y) => x * y)
    }

    def *(multiplier: Int): Matrix = {
      val multiplierArray = Array.fill(_matrixArray.length) {
        Array.fill(_matrixArray.head.length) {
          multiplier.asInstanceOf[Double]
        }
      }
      *(new Matrix(multiplierArray))
    }

    private def operate(m1: Matrix, m2: Matrix, f: (Double, Double) => Double): Matrix = {
      val resultArray = m1._matrixArray.zip(m2._matrixArray).map {
        case (a1, a2) => a1.zip(a2).map {
          case (x, y) => f(x, y)
        }
      }
      new Matrix(resultArray)
    }
  }

  object Matrix {
    def apply(matrixArray: Array[Array[Double]]): Matrix = new Matrix(matrixArray)
  }

  val a = Array.ofDim[Double](3, 2)
  a(0)(0) = 1.0
  a(0)(1) = 1.5
  a(1)(0) = 2.0
  a(1)(1) = 2.5
  a(2)(0) = 3.0
  a(2)(1) = 3.5
  val m = Matrix(a)
  println(m)
  println(m + m)
  println(m * m)
  println(m * 3)
  println(m(1,0))
}
