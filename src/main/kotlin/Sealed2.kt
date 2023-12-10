fun main(){
    val success = Result.Success("abc")
    handleResult(success)
//    val failure = Result.Failure(Throwable())
//    handleResult(failure)
}


sealed class Result {
    data class Success(val data: String) : Result()
    data class Failure(val error: Throwable) : Result()
}

class Unknown: Result()

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("success")
        }
        is Result.Failure -> {
            println("failure")
        }
        is Unknown -> {
            println("unknown")
        }
    }
}