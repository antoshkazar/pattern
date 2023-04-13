import kotlin.math.abs

class SquareFactory(val dot1: Dot, val dot2: Dot, val dot3: Dot, val dot4: Dot) : FigureFactory {
    override fun getSquare(): Double {
        return abs((dot1.x * (dot2.y - dot3.y) + dot2.x * (dot3.y - dot4.y) + dot3.x * (dot4.y - dot1.y) + dot4.x * (dot1.y - dot2.y)) / 2.0)
    }
}