package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecreationTest {

    @Test
    public void testCountRestMonthsCondition1() {
       Recreation recreation = new Recreation();

       int actual = recreation.calculate( 10000, 3000, 20000);
       int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountRestMonthsCondition2() {
        Recreation recreation = new Recreation();

        int actual = recreation.calculate( 100000, 60000, 150000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
