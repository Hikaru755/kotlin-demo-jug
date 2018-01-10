package demo.interop

import java.io.IOException


@Throws(IOException::class)
fun throwIOExceptionFromKotlin() {
    throw IOException()
}

fun main(args: Array<String>) {

    throwIOExceptionFromKotlin()

    try {
        Exceptions.throwIOExceptionFromJava()
    } catch (e: IOException) {

    }

}