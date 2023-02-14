package crash_course

var myVariable = "Hello World!"
const val myNewVariable  = "Hello Kotlin"


fun main() {
    myVariable = "Hello Brave New World"
    println(myVariable)
    println(myNewVariable)
}