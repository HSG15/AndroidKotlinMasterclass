fun main()
{
    val lucky = PersonName("mr","lucky",18)
    lucky.myHobby()
    lucky.age = 35
    println("lucky age is ${lucky.age}")

}

class PersonName(firstName : String, lastName: String)
{
    var age : Int? = null
    var hobby = "playing cricket"

    init {
        println("first name is $firstName and last name is $lastName")
    }

    fun myHobby()
    {
        println("my hobby is $hobby")
    }

    constructor(firstName: String,lastName: String,age : Int):this(firstName, lastName){

    }


}