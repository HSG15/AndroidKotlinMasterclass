fun main()
{
    val list = listOf("jan","feb","mar")
    val mutableList = list.toMutableList()
    println(mutableList)
    val newItems = arrayOf("apr","may","june")
    mutableList.addAll(newItems)
    println(mutableList) //all

    val addNew = mutableList.toMutableList()
    val newEle = arrayOf("july","aug")
    addNew.addAll(newEle)
    println(addNew)


    addNew.removeAt(2)
    val remove =  mutableListOf<String>("jan","feb")
    addNew.removeAll(remove)
   // addNew.removeAll(addNew)
    println(addNew)


}