fun main(){
    val systemManager = SystemManager()
    systemManager.addUser("abc")
    systemManager.deleteUser(("xyz"))
}


// Single Responsibility Principle Violation
// In this example the System class is trying to handle many different situation at the same time.
// This approach can cause major problems in the future.
class SystemManager{
    fun addUser(user:String){
        println("add $user")
    }
    fun deleteUser(user:String){
        println("delete $user")
    }
    fun sendNotification(message:String){
        println("notification: $message")
    }
    fun sendEmail(message:String){
        println("email $message")
    }
}


// Single Responsibility Principle Correct Usage:
// As seen in this example, we divided our System class into specific parts
// And placed the functions in their respective classes.
class UserManager(){
    fun addUser(user:String){
        println("add $user")
    }
    fun deleteUser(user:String){
        println("delete $user")
    }
}

class NotificationManager(){
    fun sendNotification(message:String){
        println("notification: $message")
    }
}

class EmailManager(){
    fun sendEmail(message:String){
        println("email $message")
    }
}