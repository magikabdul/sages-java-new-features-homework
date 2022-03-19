package cloud.cholewa.newFeatures.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void shouldReturnAreaOfTriangle() {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));

        //then
        assertThat(triangle.getArea())
                .contains("getArea() called for")
                .contains("Triangle");
    }

    @Test
    void shouldReturnNumberOfVertices() {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));

        //then
        assertThat(triangle.getNumberOfVertices())
                .isEqualTo(3);
    }

    @Test
    void shouldReturnOfDiameter() {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));

        //then
        assertThat(triangle.getDiameter())
                .isEqualTo("Triangle");
    }
}
