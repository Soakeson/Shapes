import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class LineTest {
    @Test
    fun testLineConstruction() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val l = Line(p1, p2)
        assertNotNull(l)
    }

    @Test
    fun testLineMove() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val l = Line(p1, p2)
        l.move(1.0, 1.0)
        assertEquals(2.0, p1.x)
        assertEquals(2.0, p1.y)
        assertEquals(3.0, p2.x)
        assertEquals(3.0, p2.y)
    }

    @Test
    fun testLineLength() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val l = Line(p1, p2)
        assertEquals(1.414214, l.length(), .02)
    }

    @Test
    fun testLineSlope() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val l = Line(Point(1.0,1.0), Point(2.0, 2.0))
        assertEquals(1.0, l.slope())
    }
}