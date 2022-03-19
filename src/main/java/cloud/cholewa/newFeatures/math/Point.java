package cloud.cholewa.newFeatures.math;

public record Point(double x, double y) {

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x() - x, 2) + Math.pow(point.y() - y, 2));
    }
}
