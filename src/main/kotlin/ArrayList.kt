fun main()
{
    val list = arrayListOf<Double>()
    var sum = 0.0

    list.add(28.838)
    list.add(85.459)
    list.add(76.484)
    list.add(42.957)
    list.add(53.465)

    for (i in list){
        sum = (sum+i)
    }

    println("sum is $sum")

    val avg = (sum)/list.size
    println("average is $avg")

}