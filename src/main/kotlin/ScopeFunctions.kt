fun main(){
    val employee = Employee()

    val emp = employee.apply {
        name = "a"
        age = 20
    }
    println(emp)

    val employee1: Employee? = null
    employee1?.name = "kotlin"
    employee1?.age = 5

    employee1?.let {
        it.name =  "jsk"
        it.age = 100
    }

    val employee2 = Employee()
    val result = with(employee2){
        name = "qwe"
        age = 20
        2
    }
    println(result)

    val employee3 = Employee()


}


data class Employee(var name: String = "", var age: Int = 0)
