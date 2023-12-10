fun main() {
//    print2Table()
    val fn = { x: Int ->
        for (i in 1..10) {
            println("2 * $i = " + i * x)
        }
    }
    print2Table1(2, fn)
}

inline fun print2Table1(input: Int, fn: (x: Int) -> Unit) {
    fn.invoke(input)
}

fun print2Table() {
    for (i in 1..10) {
        println(2 * i)
    }
}