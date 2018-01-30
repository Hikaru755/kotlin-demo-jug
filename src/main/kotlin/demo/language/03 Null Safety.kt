package demo.language

fun main(args: Array<String>) {

    foo("Hello World!")

    //foo(null)

}

fun foo(bar: String) {

    println(bar.length) // NPE waiting to happen? Not with Kotlin!

}