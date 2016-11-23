import util.Properties

object HelloScala {
  def main(args: Array[String]) :Unit = {
    println("Hello, Scala!")
    println(Properties.versionString)
  }
}