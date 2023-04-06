
enum class Type(val message : String){
    INFO("This is info") {
        override fun getSignal(): String {
            return "Info signal"
        }
    }, ERROR("Its an error") {
        override fun getSignal(): String {
            return "Error signal"
        }
    }, DEBUG("This is a debug message") {
        override fun getSignal(): String {
            return "Debug signal"
        }
    };

    abstract fun getSignal() : String
}

fun main() {
    val type : Type = Type.DEBUG

    val entries = Type.values()

    for(entry in entries){
        println(entry.message)

    }


}