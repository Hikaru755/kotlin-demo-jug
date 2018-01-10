package demo.language



data class Person (
    val vorname: String,
    val nachname: String,
    var email: String? = null
) {
    val fullName by lazy { vorname + nachname }
}




fun main(args: Array<String>) {

    val max = Person("Max", "Mustermann")

    println(max)
}

