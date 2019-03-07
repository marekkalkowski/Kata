package pl.marekkalkowski.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


public class NameInverterTest {

    private NameInverter nameInverter;
    private String name;
    String result;

    @BeforeEach
    void init() {
        nameInverter = new NameInverter();
    }


    @Test
    @DisplayName("Shuold return NullPointerException objcet")
    void shouldThrowNullPointerExcption() {
        //arrange
        name = null;

        //act
        try {
            result = nameInverter.invert(name);
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    @DisplayName("return IllegalArgumentException when epmty string  ")
    void returnIlegalArgumentExceptionWhenEmptyString() {
        //arrange
        name = "";
        //act
        try {
            result = nameInverter.invert(name);
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    @DisplayName("return IllegalArgumentException when white spaces ")
    void returnIlegalArgumentExceptionWhenWhiteSpaces() {
        //arrange
        name = "     ";
        //act
        try {
            result = nameInverter.invert(name);
        } catch (IllegalArgumentException e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    @DisplayName("return first name whene only first name even with white spaces ")
    void returnFirstNameWhenOnlyFirstName() {
        assertThat(nameInverter.invert("Marek")).isEqualTo("Marek");
        assertThat(nameInverter.invert("   Marek   ")).isEqualTo("Marek");
    }

    @Test
    @DisplayName("return lastCommaFirst ")
    void shouldReturnLastCommaFisrt() {
        assertThat(nameInverter.invert("Marek Kalkowski")).isEqualTo("Kalkowski, Marek");
        assertThat(nameInverter.invert("Marek      Kalkowski")).isEqualTo("Kalkowski, Marek");
    }

    @Test
    @DisplayName("return lastCommaFirst without honorifics ")
    void shouldReturnLastCommaFisrtWithoutHonorifics() {
        assertThat(nameInverter.invert("Mr. Marek Kalkowski")).isEqualTo("Kalkowski, Marek");
        assertThat(nameInverter.invert("Mrs. Dorota Kalkowska")).isEqualTo("Kalkowska, Dorota");
    }

    @Test
    @DisplayName("return lastCommaFirst with postnominals")
    void shouldReturnLastCommaFisrtWithPostnominals() {
        assertThat(nameInverter.invert("Marek Kalkowski Jr.")).isEqualTo("Kalkowski, Marek Jr.");
        assertThat(nameInverter.invert("Dorota Kalkowska Sr. Phd.")).isEqualTo("Kalkowska, Dorota Sr. Phd.");
    }

}