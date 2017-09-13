package demo.language


enum class Result {
    Success, Failure
}


fun webcall(): Result = TODO()


fun main(args: Array<String>) {

    val result = webcall()

    val display: String = when (result) {
        Result.Success -> "Success"
        Result.Failure -> "Error"
    }

    println(display)

}