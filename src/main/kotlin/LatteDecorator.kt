class LatteDecorator(espresso: Espresso): CoffeeDecorator(espresso) {
    override fun getCost(): Int {
        return espressoDecorator.getCost() + 50
    }

    override fun getDescription(): String {
        return espressoDecorator.getDescription() + " doubled"
    }

}