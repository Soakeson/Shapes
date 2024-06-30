class Circle(
    c: Point,
    r: Double,
) : Ellipse(c, r, r) {
    init {
        if (r == 0.0) {
            throw Exception("A circle cannot have 0 area.")
        }
    }
}