package ch8

class Point2(private val coordinate: Long) extends AnyVal {
  def x:Long = coordinate / Point2.divider
  def y:Long = coordinate % Point2.divider
}

private object Point2 {
  private val divider = Math.pow(2, 32).asInstanceOf[Long]
}
