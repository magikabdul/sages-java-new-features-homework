package cloud.cholewa.newFeatures.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SectionTest {

    @Test
    void shouldReturnAreaOfSection() {
        //given
        Section section = new Section(new Point(0, 0), new Point(1, 1));

        //then
        assertThat(section.getArea())
                .isEqualTo("Section area is zero");
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
