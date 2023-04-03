abstract class Person() {
    var age : Int = 0

    open fun talk(){
        println("Talking")
    }

    abstract fun walk()

}


interface Alien{
    fun doAlienThings() {

    }
}


interface Cyborg{
    fun doCyborgThings()
}


class Man() : Person(), Alien, Cyborg {

    override fun walk() {
       println("Man Walking")
    }



    override fun doCyborgThings() {
        TODO("Not yet implemented")
    }

}




fun main() {

    val man = Man() as Cyborg
    man.doCyborgThings()

}