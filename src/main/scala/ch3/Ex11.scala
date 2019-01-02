package ch3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import collection.JavaConverters._
import scala.collection.mutable

object Ex11 extends App {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val natives: mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    .asScala
  val natives2: mutable.Buffer[String]
    = asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
  println(natives.getClass.getSimpleName)
  println(natives2.getClass.getSimpleName)
}
