abstract class Person() {
    var age : Int = 0

    open fun talk(){
        println("Talking")
    }

    abstract fun walk()

}

class Man() : Person() {

    override fun walk() {
       println("Man Walking")
    }

}




fun main() {

    val man = Man()
    man.age

}