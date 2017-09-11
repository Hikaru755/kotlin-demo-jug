package demo.language

object KotlinSingleton {
    const val SOME_CONSTANT = "Hello World"
}

fun main(args: Array<String>) {

    println(KotlinSingleton.SOME_CONSTANT)

}