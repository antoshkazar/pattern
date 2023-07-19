interface MyCloneable {
    fun clone(): MyCloneable
}

class MyClass(var data: Int) : MyCloneable {
    override fun clone(): MyCloneable {
        return MyClass(this.data)
    }

    fun getMyData(): Int {
        return data
    }
}