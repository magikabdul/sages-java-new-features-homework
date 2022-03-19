package cloud.cholewa.newFeatures.math;

import cloud.cholewa.newFeatures.strings.Point;

public record Circle(cloud.cholewa.newFeatures.strings.Point point, double radius) {

    public Circle(Point point, double radius) {
        this.point = point;
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cant be negative value");
        }
        this.radius = radius;
    }
}
