package ch7

object Ex5 extends App {
  import ch7.com.horstmann.impatient.Employee
  val employee = new Employee
//  employee.giveRaise - inaccessible from this package
  print("It's not very useful because a 'com' is very often parent package.")
}

package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package impatient {
      class Employee {
        private var salary = 0.0

        private[com] def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
        }
      }
    }
  }
}
