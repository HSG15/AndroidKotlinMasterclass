class OuterClass{
    private var name : String = "Mr. x" //can access in inner class

    class NestedClass{
        var description:String = "code inside nested class"
        private var id : Int = 101

        fun foo()
        {
            println("id is $id")
        }
    }
}

fun main()
{
    println(OuterClass.NestedClass().description)

    var obj = OuterClass.NestedClass()
    obj.foo()
}