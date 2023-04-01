

  interface Logger{
    fun log()

    fun logSomethingElse()
}

fun main() {

    val logger = Logger { println("Log") }


}