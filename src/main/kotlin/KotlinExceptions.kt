
class MyCoolException(message : String) : Exception(message)

fun main() {


    val myArray = arrayOf(1,2,4,5)
//    try{
//        println(myArray[2])
//    } catch (ex : Exception){
//        println("Something bad happened!")
//    } finally {
//        println("Finally called!")
//    }
    println(getValue(myArray))
}

fun getValue(array : Array<Int>) : Int{

    return  try{
        throw MyCoolException("Let's throw an exception")
        array[8]
    }
    catch (ex : Exception){
       -1
    } catch (myException : MyCoolException) {
        0
    } finally {
        println("This executes")
    }

}