package crash_course

fun main() {
    println(getGreeting("s"))
}

private fun getGreeting(command: String): String {

    if (command == "m") {
        return "Good morning"
    } else if(command == "e"){
        return "Good Evening"
    } else{
        return "Hello"
    }


}