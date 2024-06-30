import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class EllipseTest {
    @Test
    fun testEllipseContruction() {
        val p1 = Point(1.0,1.0)
        val e = Ellipse(p1, 1.0, 2.0)
        assertNotNull(e)
    }

    @Test
    fun testEllipseMove() {
        val p1 = Point(1.0,1.0)
        val e = Ellipse(p1, 1.0, 2.0)
        e.move(1.0, 1.0)
        assertEquals(2.0, e.c.y)
    }

    @Test
    fun testEllipseArea() {
        val p1 = Point(1.0,1.0)
        val e = Ellipse(p1, 2.0, 1.0)
        assertEquals(6.28, e.area(), .02)
    }

    @Test
    fun testInvalidEllipse() {
        val p1 = Point(1.0,1.0)
        assertFails("An ellipse cannot have an area of 0.", {Ellipse(p1, 0.0, 2.0)})
        assertFails("An ellipse cannot have an area of 0.", {Ellipse(p1, 2.0, 0.0)})
    }
}
