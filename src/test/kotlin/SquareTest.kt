import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class SquareTest {
    @Test
    fun testSquareContruction() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Square(p1, p2)
        assertNotNull(r)
    }

    @Test
    fun testSquareMove() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Square(p1, p2)
        r.move(1.0, 1.0)
        assertEquals(2.0, r.p1.x)
        assertEquals(2.0, r.p1.y)
        assertEquals(3.0, r.p2.x)
        assertEquals(3.0, r.p2.y)
    }

    @Test
    fun testSquareHeight() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Square(p1, p2)
        assertEquals(1.0, r.height)
    }

    @Test
    fun testSquareWidth() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(2.0, 2.0)
        val r = Square(p1, p2)
        assertEquals(1.0, r.width)
    }


    @Test
    fun testSquareArea() {
        val p1 = Point(0.0,0.0)
        val p2 = Point(2.0, 2.0)
        val r = Square(p1, p2)
        assertEquals(4.0, r.area())
    }

    @Test
    fun testInvalidSquare() {
        val p1 = Point(1.0,1.0)
        val p2 = Point(1.0, 2.0)
        assertFails("A square must have the same width and height.", {Square(p1, p2)})
    }
}