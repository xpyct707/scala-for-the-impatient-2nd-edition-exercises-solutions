package ch7

import java.lang.System.{err, getProperty, in, out}

object Ex9 extends App {
  val userName = getProperty("user.name")

  out.print("Enter password:")
  var password = ""
  var c = in.read
  while (c != 10) {
    password += c.toChar
    c = in.read
  }

  if ("secret".equals(password)) {
    out.println(s"Hello, $userName!")
  } else {
    err.print("Wrong password!")
  }
}
