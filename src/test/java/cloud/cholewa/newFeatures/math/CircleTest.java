package cloud.cholewa.newFeatures.math;

import cloud.cholewa.newFeatures.strings.Circle;
import cloud.cholewa.newFeatures.strings.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CircleTest {

    @Test
    void shouldCreateCircleWhenRadiusIsPositive() {
        //given
        cloud.cholewa.newFeatures.strings.Point point = new cloud.cholewa.newFeatures.strings.Point(2, 6);
        double radius = 3;

        //when
        cloud.cholewa.newFeatures.strings.Circle circle = new cloud.cholewa.newFeatures.strings.Circle(point, radius);

        //then
        assertThat(circle)
                .hasFieldOrProperty("point")
                .hasFieldOrProperty("radius")
                .isInstanceOf(cloud.cholewa.newFeatures.strings.Circle.class);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenRadiusIsNegative() {
        cloud.cholewa.newFeatures.strings.Point point = new Point(0, 0);

        assertThatThrownBy(() -> new Circle(point, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Radius cant be negative value");
    }

}
