package ro.fasttrackit.curs16;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursiveFunctionsTest {
    @Test
    void testStringLength() {
        //SETUP
        RecursiveFunctions recursiveFunctions = new RecursiveFunctions();

        //RUN
        assertThat(recursiveFunctions.length(null)).isZero();
        assertThat(recursiveFunctions.length("")).isZero();
        assertThat(recursiveFunctions.length("abc")).isZero();
        assertThat(recursiveFunctions.length("teodora")).isEqualTo(7);
    }

    @Test
    void testDigitSum() {
        RecursiveFunctions recursiveFunctions = new RecursiveFunctions();
        assertThat(recursiveFunctions.digitSum(5)).isEqualTo(5);
        assertThat(recursiveFunctions.digitSum(10)).isEqualTo(1);
        assertThat(recursiveFunctions.digitSum(121)).isEqualTo(4);
    }
}
