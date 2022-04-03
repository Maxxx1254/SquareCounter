package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCounterTest {
    @ParameterizedTest
    @CsvSource(value = {" 231, 9558, 82",
            " 500, 1500, 16",
            " 1000, 9000, 63"})
    void shouldCalculate(int downLimit, int upLimit, int expected) {
        SquareCounter service = new SquareCounter();
        int actual = SquareCounter.calculate(downLimit, upLimit);
        assertEquals(expected, actual);
    }
}