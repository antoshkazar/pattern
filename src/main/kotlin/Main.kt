import java.util.Objects

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val myList = listOf<FigureFactory>(
            TriangleFactory(
                Dot(3, 1),
                Dot(4, 2),
                Dot(5, 6)
            ),
            SquareFactory(
                Dot(1, 1),
                Dot(1, 5),
                Dot(5, 6),
                Dot(6, 1)
            )
        )
        myList.forEach{ item ->
            println("item type: ${item::class}, square:  " + item.getSquare())
        }
    }
}