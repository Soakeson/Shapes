class Circle(
    origin: Point,
    r: Double,
) : Ellipse(origin, r, r) {
    init {
        if (r == 0.0) {
            throw Exception("A circle cannot have 0 area.")
        }
    }
}