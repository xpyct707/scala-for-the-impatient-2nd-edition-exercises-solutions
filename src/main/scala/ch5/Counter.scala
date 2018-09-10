package ch5

class Counter {
private var value = 0L
value = Int.MaxValue

def increment() {
  value += 1
}

def current() = value
}
