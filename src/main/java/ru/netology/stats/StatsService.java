package ru.netology.stats;

    public class StatsService {
        public int Sumarray(int[] array) {
            int sumarray = 0;

            for (int i = 0; i < array.length; i++) {
                sumarray = sumarray + array[i];
            }
            return sumarray;
        }

        public int AveragеSalesAmount(int[] array) {
            int averagе = 0;
            int averageamount = 0;

            for (int i = 0; i < array.length; i++) {
                averagе = averagе + array[i];
                averageamount = averagе / array.length;
            }
            return averageamount;
        }

        public int SalesForTheMaximumAmount(int[] array) {
            int maxMonthsales = 0;
            int maxsales = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxsales) {
                    maxsales = array[i];
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (maxsales == array[i]) {
                    maxMonthsales = i;
                }
            }

            return maxMonthsales + 1;
        }

        public int SalesForTheMinAmount(int[] array) {
            int minMonthsales = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minMonthsales]) {
                    minMonthsales = i;
                }
            }

            return minMonthsales + 1;
        }

        public int LessThanAverageSalesMonths(int[] array) {
            int averagе = 0;
            int count = 0;
            int averageamount = 0;

            for (int i = 0; i < array.length; i++) {
                averagе = averagе + array[i];
                averageamount = averagе / array.length;
            }
            for (int i = 0; i < array.length; i++) {
                if (averageamount > array[i]) {
                    count++;
                }
            }


            return count;
        }

        public int FindMonthsOfSalesAboveAverage(int[] array) {
            int averagе = 0;
            int count = 0;
            int averageamount = 0;

            for (int i = 0; i < array.length; i++) {
                averagе = averagе + array[i];
                averageamount = averagе / array.length;
            }
            for (int i = 0; i < array.length; i++) {
                if (averageamount < array[i]) {
                    count++;
                }
            }


            return count;
        }
    }




