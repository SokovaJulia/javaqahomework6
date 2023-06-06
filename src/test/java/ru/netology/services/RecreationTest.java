package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RecreationTest {
    @ParameterizedTest
    //  @CsvSource({
    //         "3,10000,3000,20000",
    //         "2,100000,60000,150000"
    //  })
    @CsvFileSource(files = "src/test/resources/recreation.csv")
    public void testCountRestMonthsCondition1(int expected, int income, int expenses, int threshold) {
        Recreation recreation = new Recreation();

        int actual = recreation.calculate(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    //   @Test
    //public void testCountRestMonthsCondition2() {
    // Recreation recreation = new Recreation();

    //int actual = recreation.calculate( 100000, 60000, 150000);
    // int expected = 2;

    // Assertions.assertEquals(expected, actual);
    // }
}
