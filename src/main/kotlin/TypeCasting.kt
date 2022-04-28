fun main() {

    val mixedTypeList: List<Any> = listOf("denis",70.5 , 837.38, "kg", 920)

    for (values in mixedTypeList) {
        when (values) {
            is String -> println("String : $values of length ${values.length}")
            is Int -> println("Integer : $values ")
            is Float -> println("Float : $values ")
            is Double -> println("Double : $values")
            //else -> println("$values are unknown")
        }
    }

    val obj: Any = "I have a dream "
    if (obj !is String)
        println("not a string")
    else
        println("$obj is a string of length ${obj.length}")

    val obj2 : Any = 2837
    val value : String? = obj2 as? String
    println(value)

}

