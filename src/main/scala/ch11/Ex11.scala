package ch11

import language.dynamics

object Ex11 extends App {
  class DynamicProps(val props: java.util.Properties) extends Dynamic {

    def applyDynamic(methodName: String)(name: String, value: String) {
      if (methodName != "add") throw new IllegalArgumentException
      updateDynamic(name)(value)
    }

    def updateDynamic(name: String)(value: String) {
      props.setProperty(name, value)
    }

    def applyDynamicNamed(name: String)(args: (String, String)*) {
      if (name != "add") throw new IllegalArgumentException
      args.foreach(pair => props.setProperty(pair._1, pair._2))
    }

    def selectDynamic(firstNamePart: String): DynamicPropsHelper =
      new DynamicPropsHelper(props, firstNamePart)
  }

  class DynamicPropsHelper(private val _props: java.util.Properties,
                           private val _firstNamePart: String) extends Dynamic {
    def updateDynamic(secondNamePart: String)(value: String): Unit = {
      _props.setProperty(s"${_firstNamePart}.$secondNamePart", value)
    }

    def selectDynamic(secondNamePart: String): DynamicPropsHelper =
      new DynamicProps(_props).selectDynamic(s"${_firstNamePart}.$secondNamePart")

    override def toString: String = _props.getProperty(_firstNamePart)
  }

  val sysProps = new DynamicProps(System.getProperties)

  //applyDynamic
  println("applyDynamic")
  sysProps.add("myProperty", "myValue")
  println(s"myProperty = ${System.getProperty("myProperty")}")
  sysProps.add("my.property", "myPropValue")
  println(s"my.property = ${System.getProperty("my.property")}")
  sysProps.add("my.long.property", "myLondPropValue")
  println(s"my.long.property = ${System.getProperty("my.long.property")}")

  //updateDynamic
  println("updateDynamic")
  sysProps.myProperty = "newMyValue"
  println(s"myProperty = ${System.getProperty("myProperty")}")
  sysProps.my.property = "newMyPropValue"
  println(s"my.property = ${System.getProperty("my.property")}")
  sysProps.my.long.property = "newMyLongPropValue"
  println(s"my.long.property = ${System.getProperty("my.long.property")}")

  //applyDynamicNamed
  sysProps.add(
    myProperty = "newNewMyValue",
    myProperty2 = "myValue2",
  //a dot can't be used in a parameter name
  //  my.property = "newMyPropValue"
  )
  println("applyDynamicNamed")
  println(s"myProperty = ${System.getProperty("myProperty")}")
  println(s"myProperty2 = ${System.getProperty("myProperty2")}")

  //selectDynamic
  println("selectDynamic")
  //it works because of implicit call of 'toString'
  println(s"myProperty = ${sysProps.myProperty}")
  println(s"my.property = ${sysProps.my.property}")
  println(s"my.long.property = ${sysProps.my.long.property}")
}
