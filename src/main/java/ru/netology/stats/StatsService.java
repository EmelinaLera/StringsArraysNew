package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int sumOfAllSales(int[] sales) {

        return Arrays.stream(sales).sum();
    }

    public int getAverageAmount(int[] sales) {
        int totalAmount = sumOfAllSales(sales);
        int averageAmount = totalAmount / 12;
        return averageAmount;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;


        }
        return maxMonth + 1;
    }

    public int numberOfMonthsBelowAverage(int[] sales) {
        int numberOfMonth = 0;
        int averageSale = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSale) {
                numberOfMonth++;
            }
        }

        return numberOfMonth;
    }

    public int numberOfMonthsHigherAverage(int[] sales) {
        int numberOfMonth = 0;
        int averageSale = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSale) {
                numberOfMonth++;
            }


        }

        return numberOfMonth;
    }
}
