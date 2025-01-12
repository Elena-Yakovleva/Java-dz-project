package lection7;

public class StatsService {

    // Сумма продаж

    public long sumSales(long[] sales) {
        long allSales = 0;
        for (long s : sales) {
            allSales += s;
        }
        return allSales;
    }
/*      long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales +=  sales[i];
        }
        return allSales;
     }
*/

    // Средняя сумма продаж в месяц

    public long averageSales(long[] sales) {

        return sumSales(sales) / sales.length;
    }

/*      // через цикл
        long averageValue = 0;
        for (int i = 0; i < sales.length; i++) {
            averageValue +=  sales[i];
        }
        averageValue = averageValue / sales.length;
        return  averageValue;
    }
        // упрощенный цикл
        long averageValue = 0;
        for (long s : sales) {
            averageValue += s;
        }
        return (averageValue / sales.length);
*/

    //Месяц с максимальными продажами

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //  Месяц с минимальными продажами

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев с продажами ниже среднего
    public int belowAverageMonths(long[] sales) {

        int count = 0;
        long middleValue = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleValue) {
                count++;
            }
        }
        return count;
    }

    // Количество месяцев с продажами выше среднего
    public int aboveAverageMonths(long[] sales) {

        int count = 0;
        long middleValue = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleValue) {
                count++;
            }
        }
        return count;
    }
}
