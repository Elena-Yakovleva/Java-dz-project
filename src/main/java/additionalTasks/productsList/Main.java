package additionalTasks.productsList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // массив продуктов
        String[] products = {"Хлеб", "Молоко", "Чай", "Сыр", "Йогурт", "Колбаса", "Картофель", "Говядина", "Яйца", "Гречка"};
        // массив цен
        int[] prices = {50, 98, 205, 230, 67, 430, 59, 403, 104, 115};

        // вывод информации о товарах и их стоимости
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб.");
        }

        // создание массива в котором будет храниться количество продуктов
        int[] productShop = new int[products.length];

        // переменные для номера товара и его количества
        int productNumber = 0;
        int productCount = 0;
        // переменная для вывода общей стоимости покупок
        int sumProducts = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер продукта или нажмите end для завершения программы: ");
            String inputString = scanner.nextLine();

            // завершение программы
            if ("end".equals(inputString)) {
                System.out.println("Список покупок завершен. ");
                for (int i = 0; i < productShop.length; i++) {
                    if (productShop[i] != 0) {
                        sumProducts += (productShop[i] * prices[i]);
                        System.out.println("Вы выбрали: " + products[i] + " в количестве " + productShop[i] + " шт." + " на сумму " + (productShop[i] * prices[i]) + " руб.");
                    } else {
                        continue;
                    }
                }
                System.out.println("Общая сумма покупок на сумму: " + sumProducts);
                break;
            }

            productNumber = Integer.parseInt(inputString) - 1;
            // проверка на граничных значений и
            if (productNumber < 0 || productNumber > (products.length - 1)) {
                System.out.println("Нет продукта с таким номером");
            } else {
                System.out.println("Введите количество продукта: ");
                inputString = scanner.nextLine();
                productCount = Integer.parseInt(inputString);

                productShop[productNumber] = productCount;
                System.out.println("Вы добавили " + products[productNumber] + " в количестве " + productCount);
            }

        }
    }
}
