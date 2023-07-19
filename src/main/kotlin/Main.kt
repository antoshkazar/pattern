object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val builder = CarBuilder()
        val toyota = builder.setBrand("Toyota").setModel("Rav 4").setYear(2002).setColor("RED").build()
        val gaz = builder.setBrand("GAZ").setModel("Yel").setEnginePower(90).setYear(1990).build()
        println(toyota)
        println(gaz)
    }
}