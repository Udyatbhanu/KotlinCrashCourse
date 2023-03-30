class Person() {

    var greeting: String = "Hello"
        get() = field.plus(" ").plus("Kotlin")
        set(value) {
            field = value.plus(" ").plus("World")
        }

    var age: Int = -1
//        get() = field
//        set(value) {
//            field = value
//        }


}

fun main() {
    val person = Person()
    person.greeting = "Hello"
    println(person.greeting)


}