package ch5

class Person(_age: Int) {
  age = if (_age < 0) 0 else _age
  var age = 0
}
