fun main(){
//    val day = listOf("SUN","MON","TUE","WED","THU")
//
//    println(day.get(0))
//    println(day.indexOf("MON"))

//    val day = listOf<String>()
//    day.
//
//    println(day.get(0))
//    println(day.indexOf("MON"))
//
//    val number = mutableListOf(1,2,3,4)
//    println(number)
//    number.add(5)
//    println(number)
//    number.removeAt(0)
//    println(number)

//    val number = mutableListOf<Int>()
//    number.add(5)
//    number.add(10)
//    println(number)
//    number.removeAt(0)
//    println(number)

//    val fruits = setOf("APPLE","MANGO","BANANA",1,2,3)
//    fruits.forEach {
//        println(it)
//    }
//    for (item in fruits){
//        println(item)
//    }
//    val lang = mutableSetOf("HINDI","ENGLISH","TAMIL","GUJRATI")
//    println(lang)
//    lang.add("BENGALI")
//    println(lang)


//    for (item in 0 until lang.size){
//        println(lang.elementAt(item))
//    }
//    val animal = mapOf<Int,String>(1 to "tiger",2 to "dog",3 to "cat")
//    animal.forEach {
//        println(it)
//    }

    val color = mutableMapOf<Int,String>()
    color.put(1,"RED")
    color.put(3,"GREEN")
    color.put(4,"BLACK")
    color.put(5,"WHITE")
//    color.forEach {
//        println(it)
//    }
    for (item in color.values){
        println(item)
    }

}