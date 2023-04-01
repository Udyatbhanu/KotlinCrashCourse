

fun interface Logger{
    fun log() : Boolean

    fun logger(){

    }
}
fun main() {

    val logger = Logger {
        println("Log")
        true
    }


}