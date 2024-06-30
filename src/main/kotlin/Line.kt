import kotlin.math.pow
import kotlin.math.sqrt

class Line (
    var p1: Point,
    var p2: Point,
) {
    fun slope() : Double {
        return (p2.y - p1.y) / (p2.x - p1.x)
    }

    fun length() : Double {
        return sqrt((p2.x - p1.x).pow(2) + (p2.y - p1.y).pow(2))
    }

    fun move(deltaX: Double, deltaY: Double) {
        p1.x += deltaX
        p2.x += deltaX
        p1.y += deltaY
        p2.y += deltaY
    }

}