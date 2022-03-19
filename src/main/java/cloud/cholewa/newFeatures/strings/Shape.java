package cloud.cholewa.newFeatures.strings;

public sealed interface Shape permits Circle, Polygon{

    String getArea();
}
