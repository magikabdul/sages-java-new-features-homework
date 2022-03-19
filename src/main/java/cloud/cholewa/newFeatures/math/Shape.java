package cloud.cholewa.newFeatures.math;

public sealed interface Shape permits Circle, Polygon {

    double getArea();
}
