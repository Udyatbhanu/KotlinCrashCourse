package crash_course

fun main(){
//    val fruits = arrayOf("Apples", "Oranges", "Pears", "Grapes")
//    println(fruits[0])
//    fruits[0] = "Bananas"
//    println(fruits[0])

    val fruitList = listOf("Apples", "Oranges", "Pears", "Grapes")
    val fruitListVal = mutableListOf("Apples", "Oranges", "Pears", "Grapes")

    var fruitListImmutableVar = listOf("Apples", "Oranges", "Pears", "Grapes")
    var fruitListMutableVar = mutableListOf("Apples", "Oranges", "Pears", "Grapes")

    var fruitListMutableVarArrayList = arrayListOf("Apples", "Oranges", "Pears", "Grapes")

    fruitListMutableVarArrayList.add("Cherries")



    println(fruitListMutableVarArrayList[1])
}