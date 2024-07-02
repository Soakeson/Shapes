import kotlin.Exception

open class Rectangle(
    p1: Point,
    p2: Point,
) : Shape() {
    var p1 = p1
        private set
    var p2 = p2
        private set

    var height = if (p1.y > p2.y) p1.y - p2.y else p2.y - p1.y
    var width = if (p1.x > p2.x) p1.x - p2.x else p2.x - p1.x
    init {
        if (p1.x == p2.x || p1.y == p2.y) {
            throw Exception("A rectangle cannot have 0 ${if (p1.x == p2.x) "width." else "height."}")
        }
    }

    override fun move(deltaX: Double, deltaY: Double) {
        move(deltaX, deltaY, listOf(p1, p2))
    }

    override fun area() : Double {
        return height * width
    }
}