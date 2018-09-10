package ch9

import scala.io.Source

object Ex8 extends App {
  def printAttributes(url: String, tag: String, attribute: String) {
    val source = Source.fromURL(url, "UTF-8")
    val pattern = f"""<$tag.+$attribute="(.+?)"""".r
    pattern.findAllMatchIn(source.mkString).foreach(m => println(m.group(1)))
    source.close
  }

  printAttributes("http://www.nachfin.info/novosti/kategorii-novostej/armejskie-novosti/2068-pervoe-regionalnoe-predstavitelstvo-nachfin-info-yuridicheskoe-byuro-dlya-voennosluzhashchikh", "img", "src")
}
