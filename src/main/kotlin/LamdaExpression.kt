fun main(){
    val msg = { println("hello")}
    // invoking function method1
    msg()
    // invoking function method2
    msg.invoke()

    val oneLineLamda = {x:Int,y:Int->x+y}

    println(oneLineLamda.invoke(10,20))

    val student = {name:String,age:Int-> println("name is: $name age is $age") }

    student.invoke("Test",15)

    //multi line lamda
    val employee = {
        val name = "test"
        val post = "SSE"
        2
    }

    println(employee.invoke())
}