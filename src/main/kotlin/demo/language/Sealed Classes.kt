package demo.language


abstract class Result<out T>
class Success<out T>(val value: T) : Result<T>()
class Failure : Result<Nothing>()


fun webcall(): Result<String> = TODO()


fun main(args: Array<String>) {

    val result = webcall()

//    val display: String = when (result) {
//        is Success -> result.value
//        is Failure -> "Error"
//    }
//
//    println(display)

}