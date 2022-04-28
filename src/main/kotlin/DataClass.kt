open class Car(speed : Double , model : String)
{
    var range : Double = 0.0

    fun extendedRange(amount: Double)
    {
        if (amount>0)
        {
            range += amount
        }
    }
    fun drive(distance : Double){
        println("drove for $distance km")
    }
}
class elecCar(speed : Double , model : String, battery : Double) : Car(speed, model) {

}

fun main()
{
    var myCar = Car(200.0,"audi")
    var myECar = elecCar(200.0,"tesla",45.0)

    var obj : Any

    myCar.drive(200.0)
    myECar.drive(200.64)
}