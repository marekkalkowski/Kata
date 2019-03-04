package pl.marekkalkowski.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
    void returnIlegalArgumentExceptionWhenEmptyString (){
        //arrange
        name = "";
        //act
        try {
            result = nameInverter.invert(name);
        }catch(IllegalArgumentException e){
            assertEquals(IllegalArgumentException.class,e.getClass());
        }
    }

    @Test
    @DisplayName("return IllegalArgumentException when white spaces ")
    void returnIlegalArgumentExceptionWhenWhiteSpaces (){
        //arrange
        name = "     ";
        //act
        try {
            result = nameInverter.invert(name);
        }catch(IllegalArgumentException e){
            assertEquals(IllegalArgumentException.class,e.getClass());
        }
    }

    @Test
    @DisplayName("return first name whene only firast name  ")
    void returnFirstNameWhenOnlyFirstName (){
        //arrange
        name = "Marek";
        //act
       result = nameInverter.invert(name);
        //assert
        assertEquals("Marek",result);
    }
}