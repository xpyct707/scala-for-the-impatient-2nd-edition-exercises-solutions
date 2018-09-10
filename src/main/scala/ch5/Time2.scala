package ch5

class Time2(_hours: Byte = 0,
            _minutes: Byte = 0) {
  if (_hours < 0 || _hours > 23) throw new IllegalArgumentException
  if (_minutes < 0 || _minutes > 59) throw new IllegalArgumentException

  private val MINUTES_IN_HOUR: Byte = 60
  private var minutesTime: Short = (_hours * MINUTES_IN_HOUR + _minutes).asInstanceOf[Short]

  def hours = (minutesTime / MINUTES_IN_HOUR).asInstanceOf[Byte]
  def minutes = (minutesTime % MINUTES_IN_HOUR).asInstanceOf[Byte]

  def before(other: Time2) = minutesTime < other.minutesTime
}
