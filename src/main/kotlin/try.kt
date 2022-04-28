fun main()
{
    val myCar = Car1()
    println("owner is ${myCar.owner}")
    println("brand is ${myCar.brand}")
}
class Car1()
{
    lateinit var owner : String

    val brand = "BMW"

    get() {
        return field.lowercase()
    }

    init {
        this.owner = "Lucky"
    }
}