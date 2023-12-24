fun main(){
    doSomething<String>("hello")
    doSomething<Int>(10)
}


private fun <T> doSomething(value:T){
    println("do something with: $value")
}