package cloud.cholewa.newFeatures.math;

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
    void shouldReturnCorrectDistanceBetweenTwoPointsEx1() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(-1, 4);

        double distance = point1.distance(point2);

        assertEquals(2 * Math.sqrt(2), distance);
    }

    @Test
    void shouldReturnCorrectDistanceBetweenTwoPointsEx2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 10);

        double distance = point1.distance(point2);

        assertEquals(10, distance);
    }

    @Test
    void shouldReturnCorrectDistanceBetweenTwoPointsEx3() {
        Point point1 = new Point(-1, 7);
        Point point2 = new Point(-1, -2);

        double distance = point1.distance(point2);

        assertEquals(9, distance);
    }

    @Test
    void shouldReturnCorrectDistanceBetweenTwoPointsEx4() {
        Point point1 = new Point(-1, 7);
        Point point2 = new Point(4, -2);

        double distance = point1.distance(point2);

        assertEquals(Math.sqrt(106), distance);
    }
}
