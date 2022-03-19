package cloud.cholewa.newFeatures.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void shouldReturnAreaOfTriangle() {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(2, 2));

        //then
        assertThat(triangle.getArea())
                .isEqualTo(2.5);
    }

    @Test
    void shouldReturnNumberOfVertices() {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));

        //then
        assertThat(triangle.getNumberOfVertices())
                .isEqualTo(3);
    }
}
