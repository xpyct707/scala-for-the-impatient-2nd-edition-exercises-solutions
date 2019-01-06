package ch5

object Ex3 extends App {
  class Time(private var _hours: Byte = 0,
             private var _minutes: Byte = 0) {
    if (_hours < 0 || _hours > 23) throw new IllegalArgumentException
    if (_minutes < 0 || _minutes > 59) throw new IllegalArgumentException

    def hours = _hours
    def minutes = _minutes

    def before(other: Time) = {
      if (_hours < other._hours) {
        true
      } else if (_hours == other._hours) {
        _minutes < other._minutes
      } else {
        false
      }
    }
  }

  val t0 = new Time(17, 58)
  val t1 = new Time(21, 36)

  assert(t0.before(t1))
  assert(!t1.before(t0))
  assert(!t0.before(t0))
}
