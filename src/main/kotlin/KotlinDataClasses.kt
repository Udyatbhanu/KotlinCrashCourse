
data class Employee(val id : Int, val name : String)

fun main() {
    val employee = Employee( name = "Jack", id = 1)
    val employee2 = employee.copy(id = 2)
    val (id, name) = employee

    println(employee2)

}