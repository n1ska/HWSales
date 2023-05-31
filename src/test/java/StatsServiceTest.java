import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void ShouldFindMediumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMedium = 15;
        long actualMedium = service.mediumSales(sales);
        Assertions.assertEquals(expectedMedium, actualMedium);
    }

    @Test
    public void ShouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMax);
    }

    @Test
    public void ShouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 2, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expectedMonth = 2;
        int actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMin);
    }

    @Test
    public void ShouldFindNumbersMonthBelowMediumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowMedium = 5;
        int actualBelowMedium = service.numberMonthWithBelowMediumSales(sales);
        Assertions.assertEquals(expectedBelowMedium, actualBelowMedium);
    }

    @Test
    public void ShouldFindNumbersMonthWithAboveMediumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedWithAboveMedium = 7;
        int actualWithAboveMedium = service.numberMonthWithAboveMediumSales(sales);
        Assertions.assertEquals(expectedWithAboveMedium, actualWithAboveMedium);
    }
}