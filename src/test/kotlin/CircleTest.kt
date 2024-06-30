import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class CircleTest {
    @Test
    fun testCircleContruction() {
        val p1 = Point(1.0,1.0)
        val c = Circle(p1, 1.0)
        assertNotNull(c)
    }

    @Test
    fun testCircleMove() {
        val p1 = Point(1.0,1.0)
        val c = Circle(p1, 1.0)
        c.move(1.0, 1.0)
        assertEquals(2.0, c.origin.y)
    }

    @Test
    fun testCircleArea() {
        val p1 = Point(1.0,1.0)
        val r = Circle(p1, 2.0)
        assertEquals(12.57, r.area(), 0.02)
    }

    @Test
    fun testInvalidCircle() {
        val p1 = Point(1.0,1.0)
        assertFails("A circle cannot have 0 area.", {Circle(p1, 0.0)})
    }
}
