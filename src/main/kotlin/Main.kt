object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val dataSource = DataSource()

        val observer1 = DataObserver("Наблюдатель 1")
        val observer2 = DataObserver("Наблюдатель 2")

        dataSource.addObserver(observer1)
        dataSource.addObserver(observer2)

        dataSource.setData("Новые данные 1")

        dataSource.removeObserver(observer2)

        dataSource.setData("Новые данные 2")
    }
}