package lection7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };


    @Test
    public void totalSumTest() {

        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmountTest() {

        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumSalesTest() {

        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumSalesTest() {

        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowSalesMonthsTest() {

        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.belowAverageMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highSalesMonthsTest() {

        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.aboveAverageMonths(sales);

        Assertions.assertEquals(expected, actual);
    }
}
