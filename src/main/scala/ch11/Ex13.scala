package ch11

import language.dynamics

object Ex13 extends App {
  class XMLBuilder extends Dynamic {

    private var _currentElement: Option[Ex12.XMLElement] = None


    def applyDynamic(elementName: String)(): XMLBuilder = {
      applyDynamicNamed(elementName)()
    }

    def applyDynamicNamed(elementName: String)(attributes: (String, String)*): XMLBuilder = {
      if (_currentElement.isEmpty) {
        _currentElement = Some(new Ex12.XMLElement(elementName, attributes.toMap))
      } else {
        _currentElement = Some(new Ex12.XMLElement(_currentElement.orNull,
          List(new Ex12.XMLElement(elementName, attributes.toMap))))
      }
      this
    }

    def build(): Ex12.XMLElement = {
      _currentElement.orNull
    }
  }

  val e = new XMLBuilder().ul(id="42", style="list-style: lower-alpha;").build()
  println(e)
  val e2 = new XMLBuilder().root().html().body().ul(id="42").li().build()
  println(e2)
}
