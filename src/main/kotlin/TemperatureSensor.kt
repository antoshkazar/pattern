interface TemperatureSensor {
    fun getTemperature(): Double
}

class NewTemperatureSensor : TemperatureSensor {
    override fun getTemperature(): Double {
        return 25.0
    }
}

class OldTemperatureSensor : TemperatureSensor {
    override fun getTemperature(): Double {
        return 20.0
    }
}

// Класс, использующий датчик температуры с помощью нового интерфейса, но который также
// снимает показания со старого датчика
class TemperatureProcessor(private val temperatureSensor: TemperatureSensor) {
    fun processTemperature(): Double {
        return temperatureSensor.getTemperature()
    }
}