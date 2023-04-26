abstract class CoffeeDecorator(private val espresso: Espresso) : Espresso() {
    protected val espressoDecorator = espresso

    abstract override fun getCost(): Int
    abstract override fun getDescription(): String
}