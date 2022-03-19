package cloud.cholewa.newFeatures.math;


public record Circle(Point point, double radius) implements Shape {

    public Circle(Point point, double radius) {
        this.point = point;
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cant be negative value");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
