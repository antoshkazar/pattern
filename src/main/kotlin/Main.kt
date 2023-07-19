object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val origin = MyClass(100)
        val cloned = origin.clone() as MyClass

        println("Original data: ${origin.getMyData()}")
        println("Clone data: ${cloned.getMyData()}")

        origin.data = 55

        println("Original data: ${origin.getMyData()}")
        println("Clone data: ${cloned.getMyData()}")
    }
}