fun main(){
    val androidDeveloper = AndroidDeveloper()
    val iosDeveloper = IosDeveloper()

    androidDeveloper.developMobileApp()
    iosDeveloper.developMobileApp()
}
//DIP (The Dependency Inversion Principle) - Depend on abstractions, not on concretions. (Abstraction)

//The Dependency Inversion Principle (DIP) states that high-level modules or classes should not
//depend on low-level modules or classes, but both
//should depend on abstractions. Abstractions should not depend on details,
//but details should depend on abstractions.

//In other words, no object should be created inside a class.
//They should be passed or injected from outside. When it  is received, it will be an interface rather than a class.

//class AndroidDeveloper{
//    fun developMobileApp(){
//        println("Developing Android Application by using Kotlin")
//    }
//}
//
//class IosDeveloper{
//    fun developMobileApp(){
//        println("Developing iOS Application by using Swift")
//    }
//}


interface MobileDeveloper{
    fun developMobileApp()
}

class AndroidDeveloper(): MobileDeveloper{
    override fun developMobileApp(){
        println("Developing Android Application by using Kotlin. ")
    }

}

class IosDeveloper: MobileDeveloper{
    override fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}
