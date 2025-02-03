package additionalTasks.doubleAndFloat;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        String menu = "\nОперации над double/float\n" +
                "1. Сравнить\n" +
                "2. Округлить\n" +
                "3. Отбросить дробную часть";

        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);

        while (true) {

            String input = scanner.nextLine();

            if ("1".equals(input) || "2".equals(input) || "3".equals(input)) { // Проверяем соответствие запроса

                int operation = Integer.parseInt(input);


                switch (operation) {
                    case 1:
                        double firstComparison = 0;
                        float secondComparison = 0;

                        System.out.println("\nВведите число double: ");
                        firstComparison = Double.parseDouble(scanner.nextLine());

                        System.out.println("\nВведите число float: ");
                        secondComparison = Float.parseFloat(scanner.nextLine());

                        double result = firstComparison - (double) secondComparison;

                        if (result > 0) {
                            System.out.println("\nDouble больше, чем float");
                        }
                        if (result < 0) {
                            System.out.println("\nFloat больше, чем double");
                        }
                        if (result == 0) {
                            System.out.println("\nОба числа равны");
                        }
                        break;

                    case 2:
                        float beforeRounding = 0;  // до округления
                        System.out.println("\nВведите  число: ");

                        beforeRounding = Float.parseFloat(scanner.nextLine());

                        long afterRounding = Math.round(beforeRounding);
                        System.out.println("Ваше число " + beforeRounding + "  после округления равно " + afterRounding);
                        break;

                    case 3:
                        float withFraction = 0; // число с дробью
                        System.out.println("\nВведите  число: ");

                        withFraction = Float.parseFloat(scanner.nextLine());

                        long noFraction = (long) withFraction; // число без дроби
                        System.out.println("Ваше число " + withFraction + " без дробной части равно " + noFraction);
                        break;

                    default:
                        System.out.println("Такой операции нет.");
                }

            }

            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

            System.out.println(menu);

        }
    }
}
