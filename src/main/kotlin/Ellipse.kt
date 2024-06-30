open class Ellipse(
    c: Point,
    var rx: Double,
    var ry: Double
) : Shape() {
    var c = c
        get() = c.copy()
        private set

    init {
        if (rx == 0.0 || ry == 0.0) {
            throw Exception("An ellipse cannot have an area of 0.")
        }
    }

    override fun move(xDelta: Double, yDelta: Double) {
        move(xDelta, yDelta, listOf(c))
    }

    override fun area() : Double {
        return Math.PI * rx * ry
    }
}