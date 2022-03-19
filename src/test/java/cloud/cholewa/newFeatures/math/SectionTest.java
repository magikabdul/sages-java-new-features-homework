package cloud.cholewa.newFeatures.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SectionTest {

    @Test
    void shouldReturnAreaOfSection() {
        //given
        Section section = new Section(new Point(0, 0), new Point(1, 1));

        //then
        assertThat(section.getArea())
                .isEqualTo(0);
    }

    @Test
    void shouldReturnNumberOfVertices() {
        //given
        Section section = new Section(new Point(0, 0), new Point(1, 1));

        //then
        assertThat(section.getNumberOfVertices())
                .isEqualTo(2);
    }
}
