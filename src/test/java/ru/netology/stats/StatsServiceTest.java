package ru.netology.stats;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void shouldFindAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.sumOfAllSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
}
    @Test
    public void shouldFindAverageAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAveragedAmount = 15;
        int actualAverageAmount = service.getAverageAmount(sales);

        Assertions.assertEquals(expectedAveragedAmount, actualAverageAmount);
    }
@Test
    public void ShouldFindMinSaleMonth () {
        StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedMinMonth = 9;
    int actualMinMonth = service.getMinSales(sales);
Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }
    @Test
    public void ShouldFindMaxSaleMonth () {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
    @Test
    public void findNumbersOfMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.numberOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }
    @Test
    public void findNumbersOfMonthsHigherAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberOfMonth = 5;
        int actualNumberOfMonth = service.numberOfMonthsHigherAverage(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }
}

