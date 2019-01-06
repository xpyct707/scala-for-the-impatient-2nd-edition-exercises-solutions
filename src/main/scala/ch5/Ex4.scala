package ch5

object Ex4 extends App {
  class Time(_hours: Byte = 0,
              _minutes: Byte = 0) {
    if (_hours < 0 || _hours > 23) throw new IllegalArgumentException
    if (_minutes < 0 || _minutes > 59) throw new IllegalArgumentException

    private val MINUTES_IN_HOUR: Byte = 60
    private var minutesTime: Short = (_hours * MINUTES_IN_HOUR + _minutes).asInstanceOf[Short]

    def hours = (minutesTime / MINUTES_IN_HOUR).asInstanceOf[Byte]
    def minutes = (minutesTime % MINUTES_IN_HOUR).asInstanceOf[Byte]

    def before(other: Time) = minutesTime < other.minutesTime
  }

  val t0 = new Time(17, 58)
  val t1 = new Time(21, 36)

  assert(t0.before(t1))
  assert(!t1.before(t0))
  assert(!t0.before(t0))
}
