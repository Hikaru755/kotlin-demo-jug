package demo.interop

import java.io.IOException



fun throwIOExceptionFromKotlin() {
    throw IOException()
}

fun main(args: Array<String>) {

    throwIOExceptionFromKotlin()

    Exceptions.throwIOExceptionFromJava()

}