fun main(){

}

// Interface Segregation Principle Violation

//This principle states that once an interface becomes too fat, it needs to be split into smaller interfaces

//interface Animal{
//    fun eat()
//    fun sleep()
//    fun fly()
//}
//
//class Cat: Animal{
//    override fun eat() {
//        println("Cat is eating fish")
//    }
//
//    override fun sleep() {
//        println("Cat is sleeping on its owner's bed")
//    }
//
//    override fun fly() {
//        TODO("Not yet implemented") // Cats can't fly
//    }
//}
//
//class Bird: Animal{
//    override fun eat() {
//        println("Bird is eating forage")
//    }
//
//    override fun sleep() {
//        println("Bird is sleeping in the nest")
//    }
//
//    override fun fly() {
//        println("Bird is flying so high")
//    }
//}

/*

 */
interface Animal{
    fun eat()
    fun sleep()
}

interface FlyingAnimal{
    fun fly()
}

class Cat: Animal{
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}

class Bird: Animal, FlyingAnimal{
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}