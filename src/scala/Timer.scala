package scala

object Timer {
  def oncePerSeconds(callback: () => Unit): Unit = {
    while (true){
      callback()
      Thread sleep 1000
    }
  }

  def printSentences(): Unit = {
    println("Time flies like an arrow...")
  }
  def main(args: Array[String]): Unit = {
    oncePerSeconds(printSentences)
    oncePerSeconds(() => println("Time flies..."))
  }
}