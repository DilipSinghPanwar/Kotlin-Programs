fun main() {
    //declaring a data class
    data class Student(val roll: Int, val name: String, val height: Int)

    //declaring a variable of the above data class
    //and initializing values to all parameters
    val student = Student(1, "abc", 50)

    //printing all the details of the data class
    println(student.toString());
}