package demo.language

fun repeat(times: Int, block: (Int) -> String ) {
    for (index in 0 until times) {
        block(index)
    }
}

fun printIndex(index: Int): String {
    println(index)
    return ""
}

fun main(args: Array<String>) {

    repeat(5) {
        printIndex(it)
        return@repeat ""
    }
    

    // Give me the first two names from this list
    // that start with an „A“, in lowercase.
     val names: List<String> by lazy {
         listOf("Max", "Alex", "Anna", "Lisa", "Albert")
             .filter { it.startsWith("A") }
             .take(2)
             .map { it.toLowerCase() }
     }

}