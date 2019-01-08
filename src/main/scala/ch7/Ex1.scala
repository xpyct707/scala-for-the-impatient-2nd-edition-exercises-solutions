package ch7

object Ex1 extends App {
  import ch7.com.xpyct.impatient.A
  assert(new A().m.getClass.getPackageName == "scala.collection.mutable")
  import ch7.com.xpyct.impatient.B
  assert(new B().m.getClass.getPackageName == "ch7.com.collection.mutable")
}

package com.collection.mutable {
  class HashMap[K, V] {}
}

package com.xpyct.impatient {
  class A {
    val m = new collection.mutable.HashMap[Int, Int]()
  }
}

package com {
  package xpyct {
    package impatient {
      class B {
        val m = new collection.mutable.HashMap[Int, Int]()
      }
    }
  }
}
