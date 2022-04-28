fun main()
{
    val arr = arrayListOf<String>()
    arr.add("lucky")
    arr.add("trupti")
    arr.add("hsg")
    println(arr)

    for(i in arr.indices)
    {
        if (arr[i] == "hsg"){
            arr[i] = "hari"
        }
    }
    println(arr)

}
