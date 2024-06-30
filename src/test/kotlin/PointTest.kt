import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PointTest {
    @Test
    fun testPointConstruction() {
        val p = Point(0.0, 0.0)
        assertNotNull(p)
    }

    @Test
    fun testPointAttributes() {
        val p = Point(1.0, 1.0)
        assertEquals(1.0, p.x)
        assertEquals(1.0, p.y)
    }

    @Test
    fun testPointMove() {
        val p = Point(1.0, 1.0)
        p.move(2.0, -2.0)
        assertEquals(3.0, p.x)
        assertEquals(-1.0, p.y)
    }

    @Test
    fun testPointCopy() {
        val p = Point(1.0, 1.0)
        val c = p.copy()
        assertEquals(p.x, c.x)
        assertEquals(p.y, c.y)
    }
}