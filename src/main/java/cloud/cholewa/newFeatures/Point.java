package cloud.cholewa.newFeatures;

public record Point(double x, double y) {

    public String distance(Point p) {
        return String.format("distance(Point p) called, to calculate distance between two points %s and %s", this, p.toString());
    }
}
