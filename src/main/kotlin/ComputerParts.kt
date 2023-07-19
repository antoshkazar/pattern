class CPU {
    fun processData(): String {
        return "Data processed by CPU"
    }
}

/**
 * В реальной жизни это библиотеки и фреймворки, но у нас будут
 * типо "сложные" классы - составные части ПК
 */

class Memory {
    fun load(): String {
        return "Data loaded into memory"
    }
}

class HardDrive {
    fun readData(): String {
        return "Data read from hard drive"
    }
}