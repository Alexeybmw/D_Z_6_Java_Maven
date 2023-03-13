package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTheSumOfTheArray() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumaArray = 180;
        int actualSumArray = service.sumArray(array);

        Assertions.assertEquals(expectedSumaArray, actualSumArray);
    }


    @Test
    public void shouldFindAverageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAveragеSalesAmount = 15;
        int actualAveragеSales = service.averagеSalesAmount(array);

        Assertions.assertEquals(expectedAveragеSalesAmount, actualAveragеSales);
    }

    @Test
    public void salesForTheMaxAmount() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesForTheMaxAmount = 8;
        int actualSalesForTheMax = service.salesForTheMaxAmount(array);

        Assertions.assertEquals(expectedSalesForTheMaxAmount, actualSalesForTheMax);
    }

    @Test
    public void shouldFindSalesForTheMinAmount() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesForTheMinAmount = 9;
        int actualSalesForTheMin = service.salesForTheMinAmount(array);

        Assertions.assertEquals(expectedSalesForTheMinAmount, actualSalesForTheMin);
    }

    @Test
    public void shouldFindLessThanAverageSalesMonths() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessThanAverageSalesMonths = 5;
        int actualLessThanAverageSalesMonths = service.lessThanAverageSalesMonths(array);

        Assertions.assertEquals(expectedLessThanAverageSalesMonths, actualLessThanAverageSalesMonths);
    }

    @Test
    public void shouldFindMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedFindMonthsOfSalesAboveAverage = 5;
        int actualFindMonthsOfSalesAboveAverage = service.findMonthsOfSalesAboveAverage(array);

        Assertions.assertEquals(expectedFindMonthsOfSalesAboveAverage, actualFindMonthsOfSalesAboveAverage);
    }
}