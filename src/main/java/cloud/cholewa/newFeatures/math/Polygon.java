package cloud.cholewa.newFeatures.math;

public abstract sealed class Polygon implements Shape permits Section, Triangle{
    private final int numberOfVertices;

    public Polygon(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
