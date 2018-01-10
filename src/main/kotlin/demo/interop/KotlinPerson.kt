package demo.interop

data class KotlinPerson
@JvmOverloads constructor(
    val name: String,
    var email: String? = null
)

fun main(args: Array<String>) {
    val jPerson = JavaPerson("Max Mustermann")
    val kPerson = KotlinPerson("Max Mustermann")

    val jName = jPerson.name
    val kName = kPerson.name

    jPerson.email = "$jName.length@example.com"
    kPerson.email = "$kName@example.com"

//    jPerson.name = ""
//    kPerson.name = ""
}