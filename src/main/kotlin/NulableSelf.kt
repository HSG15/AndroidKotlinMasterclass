fun main()
{
   var nullableName : String? = "Denis"
    //nullableName = null

    val name = nullableName ?: "Lucky"
    println(name)

    println(nullableName!!.toLowerCase())

}

