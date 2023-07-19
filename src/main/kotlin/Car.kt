data class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val enginePower: Int,
    val color: String
)

class CarBuilder {
    private var brand: String = ""
    private var model: String = ""
    private var year: Int = 0
    private var enginePower: Int = 0
    private var color: String = ""

    fun setBrand(brand: String) = apply { this.brand = brand }
    fun setModel(model: String) = apply { this.model = model }
    fun setYear(year: Int) = apply { this.year = year }
    fun setEnginePower(enginePower: Int) = apply { this.enginePower = enginePower }
    fun setColor(color: String) = apply { this.color = color }

    fun build(): Car {
        return Car(brand, model, year, enginePower, color)
    }
}