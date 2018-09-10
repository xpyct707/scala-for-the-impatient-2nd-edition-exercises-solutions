package ch11

import language.dynamics

object Ex12 extends App {
  class XMLElement(private val _name: String) extends Dynamic {
    private var _attributes: Map[String, String] = Map.empty
    private var _children: List[XMLElement] = List.empty

    def this(name: String, attributes: Map[String, String]) {
      this(name)
      _attributes = attributes
    }

    def this(name: String, children: List[XMLElement]) {
      this(name)
      _children = children
    }

    def this(name: String, attributes: Map[String, String], children: List[XMLElement]) {
      this(name, attributes)
      _children = children
    }

    def this(element: XMLElement, children: List[XMLElement]) {
      this(element._name, element._children ++ children)
    }

    def applyDynamic(childElementName: String)(): List[XMLElement] = {
      _children.find(_._name == childElementName).orNull._children
    }

    def applyDynamicNamed(childElementName: String)(attributes: (String, String)*): XMLElement = {
      _children
        .filter(_._name == childElementName)
        .find(_._attributes.map(attr => attributes.contains(attr)).forall(b => b)).orNull
    }

    def selectDynamic(childElementName: String): XMLElement = {
      _children.find(_._name == childElementName).orNull
    }

    def unapply() : List[XMLElement] = {
      _children
    }

    override def toString: String = {
      val result = new StringBuilder()
      val attrString = _attributes.map(a => a._1 + "=\"" + a._2 + "\"").mkString(" ")
      val openTag = s"${_name}${if (attrString.isEmpty) "" else " " + attrString}"
      if (_children.isEmpty) {
        s"<\\$openTag>"
      } else {
        _children.foreach(child => result ++= s"$child")
        s"<$openTag>\n$result\n</${_name}>"
      }
    }
  }

  object XMLElement {
    def unapply(element: XMLElement): Option[List[XMLElement]] = {
      Some(element._children)
    }
  }

  val li = new XMLElement("li")
  val rootElement =
    new XMLElement("root", Map("a" -> "1", "b" -> "2"),
      List(new XMLElement("html",
        List(new XMLElement("body",
          List(new XMLElement("ul", Map("id" -> "42", "cl" -> "r"),
            List(li))))))))
  println(rootElement)
  assert(li == rootElement.html.body.ul(id = "42", cl = "r").li)
  val XMLElement(liChildren) = rootElement.html.body.ul(id = "42", cl = "r").li
  println(liChildren)
  println(rootElement.html.body.ul(id = "42", cl = "r").li())
}
