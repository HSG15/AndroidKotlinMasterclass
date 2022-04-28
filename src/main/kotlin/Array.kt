fun main() {
    //val fruits = arrayOf("mango","banana","apple")
    val myFruits = arrayOf(Fruits("apple"))
    println(myFruits.contentToString())
    for (index in myFruits.indices) {
        println("${myFruits[index].name} is at index number $index of price ${myFruits[index].price} per KG ")
    }
    val name = listOf("jf",464,83.473)
    println(name)
}

data class Fruits(val name: String, val price: Int) {
    init {
        println("hy")
    }
}

