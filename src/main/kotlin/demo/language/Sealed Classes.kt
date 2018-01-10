package demo.language


sealed class Result<out T>
class Success<T>(val value: T) : Result<T>()
class Failure : Result<Nothing>()


fun webcall(): Result<String> = TODO()


fun main(args: Array<String>) {

    val result: Result<String> = webcall()

    val display: String = when (result) {
        is Success -> result.value
        is Failure -> "Error"
    }

    println(display)

}