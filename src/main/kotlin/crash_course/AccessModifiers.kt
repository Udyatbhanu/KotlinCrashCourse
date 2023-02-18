package crash_course


/**
 * public
 * protected
 * internal
 * private
 */

open class Person{
    protected val action = "Walk"

    protected fun myProtectMethod(){

    }

}


class Man : Person(){

    fun doAction() : String{
        myProtectMethod()
        return action
    }

}

internal const val myInternalVariable = 10
internal fun myInternalFunction(){
    println("My Internal runs")
}



private fun myRandomFunction(){
     val myPrivateVariable = "Private"
}



fun main(){
    myRandomFunction()
}