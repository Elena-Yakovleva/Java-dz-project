package additionalTasks.sumNumbers;

import java.util.Scanner;


public class Main {

    // Метода расчета суммы трех значений
    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Начало программы, ввод первого значения
        System.out.println("Программа расчета суммы трех чисел\nВведите первое число: ");
        int value1 = scanner.nextInt();

        // Ввод второго значения
        System.out.println("Введите второе число: ");
        int value2 = scanner.nextInt();

        // Ввод третьего значения
        System.out.println("Введите третье число: ");
        int value3 = scanner.nextInt();

        // Расчет результата
        int result = sum(value1, value2, value3);

        System.out.println("Сумма чисел = " + result);
    }
}
