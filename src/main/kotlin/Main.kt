object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        var coffee = Espresso()
        printInfo(coffee)
        coffee = CappuccinoDecorator(coffee)
        printInfo(coffee)
        coffee = LatteDecorator(coffee)
        printInfo(coffee)
    }

    private fun printInfo(coffee: Espresso) {
        print(
            "current type: ${
                coffee::class.java.toString().substringAfter(" ")
            }, price: ${coffee.getCost()}, recipe: ${coffee.getDescription()}\n"
        )
    }
}