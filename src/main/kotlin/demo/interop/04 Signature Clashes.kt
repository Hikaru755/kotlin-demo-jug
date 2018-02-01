@file:JvmName("SignatureClashes")

package demo.interop

fun List<String>.filterValid(): List<String> = filter { it.length > 2 }

// fun List<Int>.filterValid(): List<Int> = filter { it > 2 }

fun main(args: Array<String>) {

    val list = listOf<String>()

    val filtered = list.filterValid()

}