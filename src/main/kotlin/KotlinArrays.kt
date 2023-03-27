
fun main() {

    val fruitsArray = arrayOf("Apples", "Peaches", "Cherries")
    fruitsArray[2] = "Banana"

    fruitsArray.filter {
       it.startsWith('A')
    }.forEach {
        println(it)
    }

}