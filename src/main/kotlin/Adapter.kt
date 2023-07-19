class TemperatureSensorAdapter(private val oldSensor: OldTemperatureSensor) : TemperatureSensor {
    override fun getTemperature(): Double {
        val temperatureInFahrenheit = oldSensor.getTemperature()
        return (temperatureInFahrenheit + 5)
    }
}
