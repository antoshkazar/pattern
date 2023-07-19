object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val newSensor = NewTemperatureSensor()
        val adapter = TemperatureSensorAdapter(OldTemperatureSensor())

        val processor1 = TemperatureProcessor(newSensor)
        val processor2 = TemperatureProcessor(adapter)

        println("Temperature from the new sensor: ${processor1.processTemperature()} degrees Fahrenheit")
        println("Temperature from the old sensor (via adapter): ${processor2.processTemperature()} degrees Fahrenheit")
    }
}