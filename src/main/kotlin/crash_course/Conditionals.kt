package crash_course

fun main() {
    println(getGreeting("s"))
}

/**
 * ==
 * !=
 * ===
 * !==
 * >
 * <
 * >=
 * <=
 *
 *
 * &&
 * ||
 */
private fun getGreeting(command: String): String {

   val result =  if (command == "m") {
         "Good morning"
    } else if(command == "e"){
         "Good Evening"
    } else{
         "Hello"
    }

//    val result = when(command){
//        "m" -> {
//            val good = "Good"
//            val morning = "Morning"
//            good.plus(" ").plus(morning)
//        }
//        "e" -> "Good Evening"
//        else -> "Hello"
//    }

    return result

}