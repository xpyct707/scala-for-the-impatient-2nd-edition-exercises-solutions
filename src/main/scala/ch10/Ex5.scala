package ch10

import java.awt.Point
import java.beans.{PropertyChangeEvent, PropertyChangeListener, PropertyChangeSupport}

object Ex5 extends App {
  trait PropertyChangeSupportLike {
    private val pcs = new PropertyChangeSupport(this)

    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = pcs.addPropertyChangeListener(listener)

    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = pcs.removePropertyChangeListener(listener)

    def getPropertyChangeListeners: Array[PropertyChangeListener] = pcs.getPropertyChangeListeners

    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = pcs.addPropertyChangeListener(propertyName, listener)

    def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = pcs.removePropertyChangeListener(propertyName, listener)

    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = pcs.getPropertyChangeListeners(propertyName)

    def firePropertyChange(propertyName: String, oldValue: scala.Any, newValue: scala.Any): Unit = pcs.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = pcs.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = pcs.firePropertyChange(propertyName, oldValue, newValue)

    def firePropertyChange(event: PropertyChangeEvent): Unit = pcs.firePropertyChange(event)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: scala.Any, newValue: scala.Any): Unit = pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit = pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit = pcs.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

    def hasListeners(propertyName: String): Boolean = pcs.hasListeners(propertyName)
  }

  class ListenedPoint extends Point with PropertyChangeSupportLike {
    override def move(x: Int, y: Int): Unit = {
      firePropertyChange("x", this.x, x)
      firePropertyChange("y", this.y, y)
      super.move(x, y)
    }
  }

  val listener = new PropertyChangeListener {
    override def propertyChange(evt: PropertyChangeEvent): Unit = {
      println(f"'${evt.getPropertyName}' changed from '${evt.getOldValue}' to '${evt.getNewValue}'")
    }
  }

  val point = new ListenedPoint

  point.addPropertyChangeListener(listener)
  point.setLocation(2, 2)
}
