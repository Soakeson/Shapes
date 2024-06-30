class Point (
    var x: Double,
    var y: Double
) {
    fun copy(): Point {
        return Point(x, y)
    }

    fun move(xDelta: Double, yDelta: Double) {
        x += xDelta
        y += yDelta
    }
}
