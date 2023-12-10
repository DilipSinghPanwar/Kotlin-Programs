fun main(){
    val numbers = mutableListOf(1,2,3,4,5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers)
}