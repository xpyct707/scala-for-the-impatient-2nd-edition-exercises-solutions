package ch5

object Ex8 extends App {
  class Car(val manufacturer: String, val modelName: String) {
    private var _modelYear = -1
    var licensePlate = ""

    def this(manufacturer: String, modelName: String, modelYear: Int) {
      this(manufacturer, modelName)
      _modelYear = modelYear
    }

    def this(manufacturer: String, modelName: String, licensePlate: String) {
      this(manufacturer, modelName)
      this.licensePlate = licensePlate
    }

    def this(manufacturer: String, modelName: String, modelYear: Int, licensePlate: String) {
      this(manufacturer, modelName, modelYear)
      this.licensePlate = licensePlate
    }

    def modelYear = _modelYear
  }

  val c = new Car("Lada", "Vesta")
  val ca = new Car("Lada", "Vesta", "a270ox")
  val car = new Car("Lada", "Vesta", 2018)

  val cart = new Car("Lada", "Vesta", 2018, "a270ox")
  assert(cart.manufacturer == "Lada")
  assert(cart.modelName == "Vesta")
  assert(cart.modelYear == 2018)
  assert(cart.licensePlate == "a270ox")

  cart.licensePlate = "a270ox763"
  assert(cart.licensePlate == "a270ox763")
}
