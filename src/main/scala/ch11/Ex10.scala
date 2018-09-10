package ch11

import java.nio.file.{Files, Path, Paths}

import scala.collection.mutable.ArrayBuffer

object Ex10 extends App {
  object PathComponents {
    def unapply(path: Path): Option[Seq[String]] = {
      if (path == null) {
        None
      } else {
        val result = ArrayBuffer[String]()
        path.forEach(p => result += p.toString)
        Some(result)
      }
    }
  }

  val path = Paths.get("/home/cay/readme.txt")
  val PathComponents(paths) = path
  println(s"path=$path\npaths=$paths")
}
