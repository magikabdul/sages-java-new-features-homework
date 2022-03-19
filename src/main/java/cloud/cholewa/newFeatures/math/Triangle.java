package cloud.cholewa.newFeatures.math;

public non-sealed class Triangle extends Polygon {

    private final double FAKE_HEIGHT = 5;

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
    public double getArea() {
        return verticeA.distance(verticeB) * FAKE_HEIGHT / 2;
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
