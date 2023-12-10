fun main(){
    val lateInit = LateInit()
//    lateInit.initializeName()
    lateInit.checkInitialization()
}

class LateInit {
    lateinit var name: String

    fun initializeName() {
        name = "hello"
    }

    fun checkInitialization() {
        if (::name.isInitialized) {
            println("variable is initialize")
        } else {
            println("variable is not initialize")
        }
    }
}