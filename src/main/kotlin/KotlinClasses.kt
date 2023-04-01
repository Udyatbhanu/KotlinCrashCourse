
fun interface Logger{
    fun log() : Boolean

    fun logSomethingMore(){

    }
}


fun main() {

    val logger = Logger {
        println("Log this")
        true
    }


}