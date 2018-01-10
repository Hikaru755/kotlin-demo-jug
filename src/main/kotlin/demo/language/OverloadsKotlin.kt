package demo.language

import java.util.stream.Collectors
import java.util.stream.Stream

// TODO: Convert to Kotlin
class OverloadsKotlin {

    fun query(
        select: String = "*",
        from: String,
        where: String? = null,
        groupBy: String? = null,
        orderBy: String? = null
    ) {
        val query = Stream.of<String>(select, from, where, groupBy, orderBy)
            .map { it -> it ?: "_" }
            .collect(Collectors.joining(";"))
        println(query)
    }

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            val overloads = OverloadsKotlin()
            overloads.query(from = "users")
            overloads.query("name", "users")
            overloads.query(select = "name", from = "users", orderBy = "name asc")
        }
    }
}
