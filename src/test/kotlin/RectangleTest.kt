import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class RectangleTest {
    @Test
    fun testRectangleContsruction() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Rectangle(p1, p2)
        assertNotNull(r)
    }

    @Test
    fun testRectangleMove() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Rectangle(p1, p2)
        r.move(1.0, 1.0)
        assertEquals(2.0, r.p1.x)
        assertEquals(2.0, r.p1.y)
        assertEquals(3.0, r.p2.x)
        assertEquals(3.0, r.p2.y)
    }

    @Test
    fun testRectangleHeight() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 3.0)
        val r = Rectangle(p1, p2)
        assertEquals(2.0, r.height)
    }

    @Test
    fun testRectangleWidth() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Rectangle(p1, p2)
        assertEquals(1.0, r.width)
    }


    @Test
    fun testRectangleArea() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(3.0, 2.0)
        val r = Rectangle(p1, p2)
        assertEquals(2.0, r.area())
    }

    @Test
    fun testInvalidRectangle() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(1.0, 2.0)
        val p3 = Point(1.0,1.0)
        val p4 = Point(2.0, 1.0)
        assertFails("A rectangle cannot have 0 width", {Rectangle(p1, p2)})
        assertFails("A rectangle cannot have 0 height", {Rectangle(p3, p4)})
    }
}