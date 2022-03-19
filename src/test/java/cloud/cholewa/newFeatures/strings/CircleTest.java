package cloud.cholewa.newFeatures.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CircleTest {

    @Test
    void shouldCreateCircleWhenRadiusIsPositive() {
        //given
        Point point = new Point(2, 6);
        double radius = 3;

        //when
        Circle circle = new Circle(point, radius);

        //then
        assertThat(circle)
                .hasFieldOrProperty("point")
                .hasFieldOrProperty("radius")
                .isInstanceOf(Circle.class);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenRadiusIsNegative() {
        Point point = new Point(0, 0);

        assertThatThrownBy(() -> new Circle(point, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Radius cant be negative value");
    }

}
