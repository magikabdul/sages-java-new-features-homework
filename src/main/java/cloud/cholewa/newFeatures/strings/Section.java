package cloud.cholewa.newFeatures.strings;

public class Section extends Polygon {
    private final Point begin;
    private final Point end;


    public Section(Point begin, Point end) {
        super(2);
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String getArea() {
        return "Section area is zero";
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }
}
