package pl.marekkalkowski;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

private FizzBuzz fizzBuzz;

    @BeforeEach
    void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName(" \"0\" when given number 0")
    void shouldReturnWhen0() {
        //arrange
        int number = 0;

        //act
        String result = fizzBuzz.fizzBuzzKata(number);

        //assert
        assertEquals("0", result);
    }

    @Test
    @DisplayName("return fizz divisible by 3 ")
    void returFizzWhenDivisibileBy3(){
        //arrange
        int number = 3;

        //act
        String result = fizzBuzz.fizzBuzzKata(number);

        //assert
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("return Buzz divisible by 5 ")
    void returBuzzWhenDivisibileBy5(){
        //arrange
        int number = 5;

        //act
        String result = fizzBuzz.fizzBuzzKata(number);

        //assert
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("return FizzBuzz")
    void retrunFizzBuzzWhenDivisibleBy3And5(){
        //arrange
        int number = 15;

        //act
        String result = fizzBuzz.fizzBuzzKata(15);

        //assert
        assertEquals("FizzBuzz",result);
    }
}