fun main() {
    val col = setOf("blue", "black", "white", "blue")
    println(col.toSortedSet())

    val mutableList = mutableListOf(col)
    val add = setOf("grey", "red")

    // MAP
    val days = mapOf(1 to "red", 2 to "blue")
    println(days)

    val colour = mapOf(1 to Colour("red",34),2 to Colour("black",70))
    println(colour)


}

data class Colour(val name: String, val price: Int)