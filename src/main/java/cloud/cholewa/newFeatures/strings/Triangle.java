package cloud.cholewa.newFeatures.strings;

public non-sealed class Triangle extends Polygon {

    private final Point verticeA;
    private final Point verticeB;
    private final Point verticeC;

    public Triangle(Point verticeA, Point verticeB, Point verticeC) {
        super(3);
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this);
    }

    public Point getVerticeA() {
        return verticeA;
    }

    public Point getVerticeB() {
        return verticeB;
    }

    public Point getVerticeC() {
        return verticeC;
    }
}
