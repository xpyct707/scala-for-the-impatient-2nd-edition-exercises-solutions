package ch10

object Ex6 extends App {
  trait Component
  trait Container extends Component
  class JComponent extends Component
  class JContainer extends JComponent with Container
  class JButton extends JComponent
  class JPanel extends JContainer

  val button = new JButton()
  val panel = new JPanel()
}
