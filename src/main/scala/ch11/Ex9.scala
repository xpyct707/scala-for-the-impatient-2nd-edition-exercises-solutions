package ch11

import java.nio.file.{Files, Path, Paths}

object Ex9 extends App {
  object PathComponents {
    def unapply(path: Path): Option[(String, String)] = {
      if (path == null) {
        None
      } else {
        if (Files.isDirectory(path)) {
          Some(path.toString, null)
        } else {
          Some(path.getParent.toString, path.getFileName.toString)
        }
      }
    }
  }

  val path = Paths.get("/home/cay/readme.txt")
  val PathComponents(folder, file) = path
  println(s"path=$path\nfolder=$folder\nfile=$file")
}
