package co.edu.javeriana.ingsoft.kata.bizzbuzz.Fizzbuzz;

import co.edu.javeriana.ingsoft.kata.bizzbuzz.Fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Test
    void minTestDomainRange() {
        // Arange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int minValue = -1;
        //test
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(minValue));
    }

    @Test
    void maxTestDomainRange() {
        // Arange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int minValue = 101;
        //test
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(minValue));
    }

    @Test
    void testFizz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 27;
        String expected = "FIZZ";
        //Act
        String result = fizzBuzz.calculate(value);
        System.out.println(result);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 5;
        String expected = "BUZZ";
        //Act
        String result = fizzBuzz.calculate(value);
        System.out.println(result);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testNumero() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 14;
        String expected = "14";
        //Act
        String result = fizzBuzz.calculate(value);
        //Assert
        assertEquals(expected, result);
    }
}
