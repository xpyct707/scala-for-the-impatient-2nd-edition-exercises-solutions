package ch7
package com
package xpyct
package impatient

object Ex2 extends App {
  val m = new com.collection.mutable.HashMap[Int, Int]()
  assert(m.getClass.getPackageName == "ch7.com.collection.mutable")
}
