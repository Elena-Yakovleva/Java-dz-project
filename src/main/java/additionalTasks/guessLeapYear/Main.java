package additionalTasks.guessLeapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: год и количество дней в формате 'yyyy' и 'ууу'.");

        int year = scanner.nextInt();
        int days = scanner.nextInt();

        int daysYear = 0;

        if (year <= 0) {
            System.out.println("Год не может быть отрицательным числом или равен 0.");
        }
        if (days < 365) {
            System.out.println("В году не может быть меньше 365 дней");
        }
        if (days > 366) {
            System.out.println("В году не может быть больше 366 дней");
        }

        if (year % 400 == 0) {
            daysYear = 366;
        } else if (year % 100 == 0) {
            daysYear = 365;
        } else if (year % 4 == 0) {
            daysYear = 366;
        } else {
            daysYear = 365;
        }

        int counter = 0;
        while (daysYear == days) {
            counter++;
            System.out.println("Введите число: год и количество дней в формате 'yyyy' и 'уу'.");
            year = scanner.nextInt();
            days = scanner.nextInt();

            if (year % 400 == 0) {
                daysYear = 366;
            } else if (year % 100 == 0) {
                daysYear = 365;
            } else if (year % 4 == 0) {
                daysYear = 366;
            } else {
                daysYear = 365;
            }
        }

        if (daysYear != days) {
            System.out.println("Неправильно! В этом году " + daysYear + " дней.\nВы выиграли: " + counter + " раза.");
        }

    }
}
