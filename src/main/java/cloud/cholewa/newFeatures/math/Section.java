package cloud.cholewa.newFeatures.math;

public class Section extends Polygon {
    private final Point begin;
    private final Point end;

    public Section(Point begin, Point end) {
        super(2);
        this.begin = begin;
        this.end = end;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }
}
