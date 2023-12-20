fun main(){


}

open class Bird{
 fun makeSound(){}
 fun fly() {}
}

class Eagle : Bird()
class Penguin : Bird() // fails LSP because it cannot fly therefore has different behaviour and cannot call fly() method

// solution

open class Bird{
 fun makeSound(){}
}

open class FlyingBird : Bird() {
 fun fly() {}
}

class Eagle : FlyingBird()
class Penguin : Bird()

//Child classes should never break the parent class’ type definitions.
//It means that a subclass should override the methods from a parent class,
// which does not break the functionality of the parent class.

//A parent object should be able to replace its child during runtime polymorphism.

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
