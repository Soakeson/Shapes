abstract class Shape() {
    abstract fun move(xDelta: Double, yDelta: Double);
    abstract fun area() : Double;
    protected fun move(xDelta: Double, yDelta: Double, points: List<Point>) {
        for (p in points) {
            p.x += xDelta
            p.y += yDelta
        }
    }
    protected fun points(points : List<Point>) : List<Point> {
        val pointsCopy = points.map { it.copy() }
        return pointsCopy
    }
}
