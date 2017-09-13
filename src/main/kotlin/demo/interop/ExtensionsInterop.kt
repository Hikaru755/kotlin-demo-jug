package demo.interop

fun String.lastChar(): Char {
    return this[length - 1]
}

fun main(args: Array<String>) {
    val last = "Hello".lastChar()
    println(last)
}