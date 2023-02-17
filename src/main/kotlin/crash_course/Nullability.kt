package crash_course

val myStrVal : String? = null
val myNullable : String? = null
fun main(){
    println(myStrVal!!.uppercase())
}