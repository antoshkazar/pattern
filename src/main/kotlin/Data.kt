class DataSource {
    private val observers = mutableListOf<Observer>()
    private var data: Any? = null

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun setData(data: Any) {
        this.data = data
        notifyObservers()
    }

    private fun notifyObservers() {
        observers.forEach { observer ->
            observer.trigger(data)
        }
    }
}

class DataObserver(private val name: String) : Observer {
    override fun trigger(data: Any?) {
        println("$name получил обновление: $data")
    }
}