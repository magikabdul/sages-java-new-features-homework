package cloud.cholewa.newFeatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shouldGetCorrectPointCoordinates() {
        Point p = new Point(1, 5);

        assertAll(() -> {
            assertEquals(1, p.x());
            assertEquals(5, p.y());
        });
    }

    @Test
    void shouldReturnCorrectDistanceBetweenTwoPoints() {
        String expected = "distance(Point p) called, to calculate distance between two points Point[x=2.0, y=4.0] and Point[x=7.0, y=-4.0]";
        Point p1 = new Point(2, 4);
        Point p2 = new Point(7, -4);

        String result = p1.distance(p2);

        assertEquals(expected, result);
    }
}
