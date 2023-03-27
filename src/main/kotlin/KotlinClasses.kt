class Person(val age : Int) : Any(){

    override fun toString() : String{
        return "This is a person object"
    }





}

fun main(){
    val person  = Person(20)
    val person1 = Person(25)

    println(person)
}