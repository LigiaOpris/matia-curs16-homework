package ro.fasttrackit.curs16.myHomework.ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursiveMethodsTest {
    @Test
    void testSumOfTheFirstNIntegers() {
        //SETUP
        RecursiveMethods sumOfTheFirstNIntegers = new RecursiveMethods();

        //RUN
        int number = sumOfTheFirstNIntegers.sumOfTheFirstNIntegers(10);

        //ASSERT
        assertThat(number).isEqualTo(55);
    }

    @Test
    void testSumOfTheEvenNumbers() {
        //SETUP
        RecursiveMethods sumOfTheEvenNumbers = new RecursiveMethods();

        //RUN
        int number = sumOfTheEvenNumbers.sumOfTheEvenNumbers(20);

        //ASSERT
        assertThat(number).isEqualTo(420);
    }

    @Test
    void testPalindromeStringMethodOneThrowsException() {
        //SETUP
        RecursiveMethods palindromeStringMethodOne = new RecursiveMethods();

        //RUN
        String word = palindromeStringMethodOne.palindromeStringMethodOne("madam");

        //ASSERT
        assertThrows(IllegalArgumentException.class, () -> palindromeStringMethodOne.palindromeStringMethodOne("You have to enter a word"));
    }

    @Test
    void testPalindromeStringMethodOne() {
        //SETUP
        RecursiveMethods palindromeStringMethodOne = new RecursiveMethods();

        //RUN
        String word = palindromeStringMethodOne.palindromeStringMethodOne("madam");

        //ASSERT
        assertThat(word).isEqualTo("madam");
    }

    @Test
    void testPalindromeStringMethodTwoThrowsException() {
        //SETUP
        RecursiveMethods palindromeStringMethodTwo = new RecursiveMethods();

        //RUN
        boolean verify = palindromeStringMethodTwo.palindromeStringMethodTwo("madam");

        //ASSERT
        assertThrows(IllegalArgumentException.class, () -> palindromeStringMethodTwo.palindromeStringMethodTwo("You have to enter a word"));
    }

    @Test
    void testPalindromeStringMethodTwo() {
        //SETUP
        RecursiveMethods palindromeStringMethodTwo = new RecursiveMethods();

        //RUN
        boolean verify = palindromeStringMethodTwo.palindromeStringMethodTwo("madam");

        //ASSERT
        assertThat(verify).isEqualTo(true);
    }

    @Test
    void testSumOfDigits() {
        //SETUP
        RecursiveMethods sumOfDigits = new RecursiveMethods();

        //RUN
        int number = sumOfDigits.sumOfDigits(123456789);

        //ASSERT
        assertThat(number).isEqualTo(45);
    }

    @Test
    void testFibonacciArray() {
        //SETUP
        RecursiveMethods fibonacciArray = new RecursiveMethods();

        //RUN
        int number = fibonacciArray.fibonacciArray(10);

        //ASSERT
        assertThat(number).isEqualTo(55);
    }
}
