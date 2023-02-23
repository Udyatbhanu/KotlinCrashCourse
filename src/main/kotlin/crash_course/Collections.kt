package crash_course

fun main(){

//    val ageMap = mapOf(
//        "Jack" to 21,
//        "Sara" to 23,
//        "Drake" to 30
//    )

    val ageMap = mutableMapOf(
        Pair("Jack" ,21),
        Pair("Sara" ,23),
        Pair("Drake" ,30),
    )
    println(ageMap["Jack"])
}