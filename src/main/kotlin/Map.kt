fun main(){
    val list = mutableListOf(1,2,3,4,5)
    list.map {
        println(it * it)
    }
    println(list)
}