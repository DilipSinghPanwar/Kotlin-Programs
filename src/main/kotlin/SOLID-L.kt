fun main(){


}

//abstract class Vehicle{
//    abstract fun startEngine()
//    abstract fun stopEngine()
//    abstract fun moveForward()
//    abstract fun moveBack()
//}
//
//class Car: Vehicle(){
//    override fun startEngine() {
//        println("Engine started")
//    }
//
//    override fun stopEngine() {
//        println("Engine stopped")
//    }
//
//    override fun moveForward() {
//        println("Moving forward")
//    }
//
//    override fun moveBack() {
//        println("Moving back")
//    }
//}
//
//class Bicycle: Vehicle(){
//    override fun startEngine() {
//        // TODO("Not yet implemented")
//    }
//
//    override fun stopEngine() {
//        // TODO("Not yet implemented")
//    }
//
//    override fun moveForward() {
//        println("Moving forward")
//    }
//
//    override fun moveBack() {
//        println("Moving back")
//    }
//}

/*

 */

interface Vehicle{
    fun moveForward()
    fun moveBack()
}

abstract class VehicleWithEngine: Vehicle{
    abstract fun startEngine()
    abstract fun stopEngine()
}

class Car: VehicleWithEngine(){
    override fun startEngine() {
        println("Engine started")
    }

    override fun stopEngine() {
        println("Engine stopped")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

class Bicycle: Vehicle{
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}