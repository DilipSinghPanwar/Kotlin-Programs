fun main(){
//    val num = ::printNum
//    higherOrderFun(printNum)
    higherOrderFun1(lamdaSum)
}

val printNum = {
    for (i in 1..10){
        println(i)
    }
    2
}

fun higherOrderFun(fn:()->Int){
    println("this is higher order function ${fn.invoke()}")
}

var lamdaSum = {x:Int,y:Int->x+y}

fun higherOrderFun1(fn:(Int,Int)->Int){
    var sum = fn(2,2)
    println("sum is: "+sum)
}