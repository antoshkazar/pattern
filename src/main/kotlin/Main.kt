object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val computerFacade = ComputerFacade()
        val result = computerFacade.start()
        println(result)
    }
}