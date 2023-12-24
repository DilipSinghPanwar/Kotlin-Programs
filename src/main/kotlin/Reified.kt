fun main(){
    doSomething<String>("hello")
    doSomething<Int>(10)
}


private inline fun <reified T> doSomething(value:T){
    println("do something with: $value")
    println("do something with Type: ${T::class.java}")
}