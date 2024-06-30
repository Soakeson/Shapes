class Square(p1: Point, p2: Point) : Rectangle(p1, p2) {
    init {
        if (height != width) {
            throw Exception("A square must have the same width and height.")
        }
    }
}