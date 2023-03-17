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
//    println(ageMap["Jack"])

    val fruitsList = listOf("Apples", "Oranges", "Peaches", "Apricot")
    val fruitSet = setOf("Apples", "Oranges", "Peaches", "Apricot")

    val fruit = fruitSet.find {
        it == "Peaches"
    }

    println(fruit)
//    fruitSet.iterator()
//     for(fruit in fruitSet){
//
//     }
//    fruitsList.add("Banana")

//    val startsWithA = fruitsList.filter {
//        it.startsWith('A')
//    }

//    fruitsList.filter {
//        it.endsWith('s', true)
//    }.forEach {
//        println(it)
//    }

//    val result = fruitsList.map{
//        it.lowercase()
//    }
//
//    fruitsList.filter { fruit ->
//        fruit.startsWith('A')
//
//    }.forEach{
//        println(it)
//    }

}