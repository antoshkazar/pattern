class CappuccinoDecorator(espresso: Espresso): CoffeeDecorator(espresso) {
    override fun getCost(): Int {
        return espressoDecorator.getCost() + 100
    }

    override fun getDescription(): String {
        return espressoDecorator.getDescription() + " with milk"
    }
}