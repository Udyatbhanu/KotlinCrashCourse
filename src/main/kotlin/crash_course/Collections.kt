package crash_course

fun main(){
    val fruits = arrayOf("Apples", "Oranges", "Pears", "Grapes")
    println(fruits[0])
    fruits[0] = "Bananas"
    println(fruits[0])
}