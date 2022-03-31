package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCounterTest {
    @ParameterizedTest
    @CsvSource(value = {"'under limit', 10, 100",
    "'in limit', 20, 400",
    "'over limit', 40, 1600"})
    void shouldCalculate(String[] i, int expected) {
        SquareCounter service = new SquareCounter();
        int actual = SquareCounter.calculate(i);
        assertEquals(expected, actual);
    }
}