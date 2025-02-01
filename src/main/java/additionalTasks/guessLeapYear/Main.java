package additionalTasks.guessLeapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Years years = new Years();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: год и количество дней в формате 'yyyy' и 'ууу': \n");

        int daysYear = years.calculate(scanner.nextInt());
        int days = scanner.nextInt();


        int counter = 0;

        while (daysYear == days) {
            counter++;
            System.out.println("Введите число: год и количество дней в формате 'yyyy' и 'ууу': \n");
            daysYear = years.calculate(scanner.nextInt());
            days = scanner.nextInt();

        }

        while (daysYear != days) {
            System.out.println("Неправильно! В этом году " + daysYear + " дней.\nВы выиграли: " + counter + " раза.");
            break;
        }

        while (days < 365 || days > 366) {
            System.out.println("В году может быть только 365 или 366 дней.");
            break;
        }


    }
}

