package demo.language

data class Person (
    val vorname: String,
    val nachname: String,
    var email: String? = null
)

fun main(args: Array<String>) {
    val max = Person("Max", "Mustermann")



    println(max)
}