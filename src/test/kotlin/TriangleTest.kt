import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class TriangleTest {
    @Test
    fun testTriangleContruction() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0,3.0)
        val p3 = Point(3.0,1.0)
        val t = Triangle(p1, p2, p3)
        assertNotNull(t)
    }

    @Test
    fun testTriangleMove() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0,3.0)
        val p3 = Point(3.0,1.0)
        val t = Triangle(p1, p2, p3)
        t.move(1.0, 1.0)
        assertEquals(2.0, t.p1.x)
        assertEquals(2.0, t.p1.y)
        assertEquals(3.0, t.p2.x)
        assertEquals(4.0, t.p2.y)
        assertEquals(4.0, t.p3.x)
        assertEquals(2.0, t.p3.y)
    }

    @Test
    fun testTriangleArea() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0,3.0)
        val p3 = Point(3.0,1.0)
        val t = Triangle(p1, p2, p3)
        println(t.area())
        assertEquals(2.0, t.area(), .02)
    }

    @Test
    fun testInvalidTriangle() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0,1.0)
        val p3 = Point(3.0,1.0)
        assertFails("A triangle's area cannot be 0.", {Triangle(p1, p1, p2)})
    }
}
