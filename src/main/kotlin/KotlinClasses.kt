

class Logger{

    interface FrontEndLogger{
        fun log()

        fun logMore(){

        }
    }


}


fun logFrontEnd(logger : Logger.FrontEndLogger){
    logger.log()
}
fun main() {

    val logger = object : Logger.FrontEndLogger{
        override fun log() {
            println("Log frontend")
        }
    }

    logFrontEnd(logger)


}