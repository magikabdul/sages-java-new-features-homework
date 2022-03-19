package cloud.cholewa.newFeatures.strings;

public record Circle(Point point, double radius) {

    public Circle(Point point, double radius) {
        this.point = point;
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cant be negative value");
        }
        this.radius = radius;
    }
}
