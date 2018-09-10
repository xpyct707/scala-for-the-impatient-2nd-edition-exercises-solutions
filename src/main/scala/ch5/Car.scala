package ch5

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
