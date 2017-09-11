package demo.language

object StringUtils {

    fun lastChar(string: String): Char {
        return string[string.length - 1]
    }

}

fun main(args: Array<String>) {
    val last = StringUtils.lastChar("Hello")
    println(last)
}