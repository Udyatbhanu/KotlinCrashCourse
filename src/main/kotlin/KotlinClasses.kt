
 fun interface Logger{
    fun log() : Boolean

    fun logSomethingElse(){

    }
}

fun main() {

    val logger = Logger{
        println("print  this")
        true
    }

}