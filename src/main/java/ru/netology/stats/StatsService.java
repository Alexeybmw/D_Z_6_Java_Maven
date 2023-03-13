package ru.netology.stats;

public class StatsService {
    public int sumArray(int[] array) {

        int sumarray = 0;

        for (int i = 0; i < array.length; i++) {
            sumarray = sumarray + array[i];
        }

        return sumarray;
    }

    public int averagеSalesAmount(int[] array) {

        int sumarray = sumArray(array);
        int averageamount = sumarray / array.length;

        return averageamount;
    }


    public int salesForTheMaxAmount(int[] array) {

        int maxMonth = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int salesForTheMinAmount(int[] array) {

        int minMonthsales = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minMonthsales]) {
                minMonthsales = i;
            }
        }

        return minMonthsales + 1;
    }

    public int lessThanAverageSalesMonths(int[] array) {

        int count = 0;
        int averageamount = averagеSalesAmount(array);

        for (int i = 0; i < array.length; i++) {
            if (averageamount > array[i]) {
                count++;
            }
        }

        return count;
    }

    public int findMonthsOfSalesAboveAverage(int[] array) {

        int count = 0;
        int averageamount = averagеSalesAmount(array);

        for (int i = 0; i < array.length; i++) {
            if (averageamount < array[i]) {
                count++;
            }
        }

        return count;
    }
}









