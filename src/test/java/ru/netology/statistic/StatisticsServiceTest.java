
package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ru.netology.statistic.jacocomvn.services.StatisticsService;

public class StatisticsServiceTest {


    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 3;

        long actual = service.findMin(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sum() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12 + 5 + 8 + 4 + 5 + 3 + 8 + 6 + 11 + 11 + 12;
        long actual = service.sum(incomes);

        Assertions.assertEquals(expected, actual);
    }

@Test
    void average() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = (12 + 5 + 8 + 4 + 5 + 3 + 8 + 6 + 11 + 11 + 12) / 11;
        long actual = service.average(incomes);

        Assertions.assertEquals(expected, actual);
    }

@Test
    void calcNumberMoreAverage() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.calcNumberMoreAverage(incomes);
        long expected =6;
    }


    @Test
    void calcNumberBelowAverage() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.calcNumberBelowAverage(incomes);
        long expected =5;
    }


    @Test
    void calcPercent() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = (12 + 5 + 8 + 4 + 5 + 3 + 8 + 6 + 11 + 11 + 12) *5/ 100;
        long actual = service.calcPercent(incomes);

        Assertions.assertEquals(expected, actual);
    }


}