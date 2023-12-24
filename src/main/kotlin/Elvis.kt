fun main() {
//    val input : String = "hello how are you?"
    val input : String? = null
    val length = input?.length ?: -1
    println("input length: $length")
}