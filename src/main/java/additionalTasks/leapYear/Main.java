package additionalTasks.leapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате 'уууу': ");

        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Результат: " + year + " год является высокосным");
        }
        else  if (year % 100 == 0) {
            System.out.println("Результат: " + year + " год не является высокосным");
        }
        else if (year % 4 == 0) {
            System.out.println("Результат: " + year + " год является высокосным");
        }
        else {
            System.out.println("Результат: " + year + " год не является высокосным");
        }

    }
}
