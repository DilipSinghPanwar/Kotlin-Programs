fun main(){
    val studentsSubjects = listOf(
        listOf("Math", "Science"),
        listOf("History", "Geography"),
        listOf("Physics", "Chemistry")
    )
    val allSubjects = studentsSubjects.flatMap { it }
    println(allSubjects)  // [Math, Science, History, Geography, Physics, Chemistry]
}

