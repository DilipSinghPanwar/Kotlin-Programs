fun main() {
    val text: String = "how are you?"
    val output = text.getAllWords()
    println(output)
}

fun String.getAllWords(): List<String> {
    return this.split(" ")
}