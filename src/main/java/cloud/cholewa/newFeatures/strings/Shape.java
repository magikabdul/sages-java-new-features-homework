package cloud.cholewa.newFeatures.strings;

public sealed interface Shape permits Circle, Polygon{

    String getArea();

    default String getDiameter() {
        //return String.format("getDiameter() called from %s", this.getClass().getSimpleName());
        return switch (this.getClass().getSimpleName()) {
            case "Triangle" -> "Triangle";
            case "Section" -> "Section";
            case "Circle" -> "Circle";
            default -> "Shape";
        };
    }
}
