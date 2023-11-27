fun main() {
    val student1: Student? = null
//    student1?.name = "abc"
//    student1?.className = "12"
    student1?.let {
        it.name = "abc"
        it.className = "10"
    }

    val student2 = Student().apply {
        name = "abc"
        className = "12"
    }
    println("student2: $student2")

    val student3 = Student().run {
        name = "abc"
        className = "12"
        "hello"
    }
    println("student3: $student3")

    val student4 = Student()
    val result = with(student4){
        name = "abc"
        className = "12"
        "Jsk"
    }
    println("student4: $result")


    val student5 = Student().also {
        it.printStudentDetails()
    }
    println("student5: $student5")
}

class Student() {
    var name: String = "XYZ"
    var className: String = "10"
    fun printStudentDetails() {
        println("Student Name: $name Student Class: $className")
    }
    override fun toString(): String {
        return "Student(name='$name', className='$className')"
    }
}
