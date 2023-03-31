abstract class Person{
    var age : Int = 0


    abstract fun walk()

}

interface Runner{
    fun run()
}

interface Talker{
    fun talk()
}

class Man() : Person() , Runner, Talker {

    override fun walk() {
       println("Man Walking")
    }

    override fun run() {
      println("Run")
    }

    override fun talk() {
        println("Talk")
    }

}




fun main() {

    val man = Man()
    man.age

}