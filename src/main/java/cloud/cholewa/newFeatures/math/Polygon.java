package cloud.cholewa.newFeatures.math;

public abstract non-sealed class Polygon implements Shape {
    private final int numberOfVertices;

    public Polygon(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
