package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldFindTheSumOfTheArray() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumaArray = 180;
        int actualSumArray = service.Sumarray(array);

        Assertions.assertEquals(expectedSumaArray, actualSumArray);
    }


    @Test
    public void ShouldFindAverageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAveragеSalesAmount = 15;
        int actualAveragеSales = service.AveragеSalesAmount(array);

        Assertions.assertEquals(expectedAveragеSalesAmount, actualAveragеSales);
    }

    @Test
    public void ShouldFindSalesForTheMaximumAmount() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19,20, 7, 14, 14, 18};
        int expectedSalesForTheMaximumAmount = 8;
        int actualSalesForTheMax = service.SalesForTheMaximumAmount(array);

        Assertions.assertEquals(expectedSalesForTheMaximumAmount, actualSalesForTheMax);
    }

    @Test
    public void ShouldFindSalesForTheMinAmount() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesForTheMinAmount = 9;
        int actualSalesForTheMin = service.SalesForTheMinAmount(array);

        Assertions.assertEquals(expectedSalesForTheMinAmount, actualSalesForTheMin);
    }

    @Test
    public void ShouldFindLessThanAverageSalesMonths() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessThanAverageSalesMonths = 5;
        int actualLessThanAverageSalesMonths = service.LessThanAverageSalesMonths(array);

        Assertions.assertEquals(expectedLessThanAverageSalesMonths, actualLessThanAverageSalesMonths);
    }

    @Test
    public void ShouldFindMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedFindMonthsOfSalesAboveAverage = 5;
        int actualFindMonthsOfSalesAboveAverage = service.FindMonthsOfSalesAboveAverage(array);

        Assertions.assertEquals(expectedFindMonthsOfSalesAboveAverage, actualFindMonthsOfSalesAboveAverage);
    }
}