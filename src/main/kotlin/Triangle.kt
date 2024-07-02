import java.lang.Exception

class Triangle (
    p1: Point,
    p2: Point,
    p3: Point
) : Shape() {
    var p1 = p1
        private set
    var p2 = p2
        private set
    var p3 = p3
        private set

    private val xCords = listOf<Double>(p1.x, p2.x, p3.x)
    private val yCords = listOf<Double>(p1.y, p2.y, p3.y)
    val base = xCords.max() - xCords.min()
    val height = yCords.max() - yCords.min()

    init {
        if (p1.x == p2.x && p2.x == p3.x || p1.y == p2.y && p2.y == p3.y) {
            throw Exception("A triangle's area cannot be 0.")
        }
    }

    override fun area(): Double {
        return (base * height) / 2
    }

    override fun move(xDelta: Double, yDelta: Double) {
        move(xDelta, yDelta, listOf(p1, p2, p3))
    }
}