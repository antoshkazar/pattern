class ComputerFacade {
    private val cpu: CPU = CPU()
    private val memory: Memory = Memory()
    private val hardDrive: HardDrive = HardDrive()

    fun start(): String {
        val processData = cpu.processData()
        val loadMemory = memory.load()
        val readData = hardDrive.readData()

        return "$processData\n$loadMemory\n$readData"
    }
}