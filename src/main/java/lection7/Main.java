package lection7;

public class Main {

    public static void main(String[] args) {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();

        // сумма всех продаж
        long totalSum = service.sumSales(sales);
        System.out.println("Общая сумма продаж за год составляет: " + totalSum);

        // средняя сумма продаж
        long averageSalesAmount = service.averageSales(sales);
        System.out.println("Средняя сумма продаж в месяц составляет: " + averageSalesAmount);

        // максимальные продажи
        int maximumSales = service.maxSales(sales);
        System.out.println("Самые высокие продажы были в " + maximumSales + " месяце");

        // минимальные продажи
        int minimumSales = service.minSales(sales);
        System.out.println("Самые низкие продажи были в " + minimumSales + " месяце");

        // количество месяцев с продажами ниже среднего
        int lowSalesMonths = service.belowAverageMonths(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + lowSalesMonths);

        // количество месяцев с продажами выше среднего
        int highSalesMonths = service.aboveAverageMonths(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + highSalesMonths);

    }
}