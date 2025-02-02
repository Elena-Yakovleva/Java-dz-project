package additionalTasks.accounting;

import java.util.Scanner;

import static additionalTasks.accounting.TaxEarnings.taxEarnings;
import static additionalTasks.accounting.TaxEarningsMinusSpendings.taxEarningsMinusSpendings;

public class Main {

    public static void main(String[] args) {


        String menu = ("\nВыберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Баланс доходов и расходов\n" +
                "4. Выбрать систему налогообложения");

        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        while (true) {
            String input = scanner.nextLine();

            // Выбор операции
            if ("1".equals(input) || "2".equals(input) || "3".equals(input) || "4".equals(input)) {

                int operation = Integer.parseInt(input);

                switch (operation) {
                    case 1: // Добавление дохода
                        System.out.println("Введите сумму дохода: ");
                        String moneyStrIncome = scanner.nextLine();
                        int moneyIncome = Integer.parseInt(moneyStrIncome);
                        earnings += moneyIncome;
                        break;

                    case 2: // Добавление расхода
                        System.out.println("Введите сумму расхода: ");
                        String moneyStrExpenditure = scanner.nextLine();
                        int moneyExpenditure = Integer.parseInt(moneyStrExpenditure);
                        spendings += moneyExpenditure;
                        break;

                    case 3: // Вывод баланса
                        System.out.println("Ваш доход сейчас составляет: " + earnings + " рублей\n" +
                                           "Ваш расход сейчас составляет: " + spendings + " рублей");
                        break;

                    case 4: // Расчет налога
                        int tax1 = taxEarnings(earnings);

                        int tax2 = taxEarningsMinusSpendings(earnings, spendings);

                        if (tax1 <= tax2) {
                            System.out.println(
                                    "Мы советуем Вам \"УСН доходы\"" +
                                            "\nВаш налог составит: " + tax1 +
                                            "\nНалог в другой системе: " + tax2 +
                                            "\nЭкономия составит: " + tax2 + " - " + tax1 + " = " + (tax2 - tax1) + "рублей");
                        } else {
                            System.out.println(
                                    "Мы советуем Вам \"УСН доходы минус расходы\"" +
                                            "\nВаш налог составит: " + tax2 +
                                            "\nНалог в другой системе: " + tax1 +
                                            "\nЭкономия составит: " + tax1 + " - " + tax2 + " = " + (tax1 - tax2) + "рублей");
                        }
                        break;

                    default:
                        System.out.println("Такой операции нет.");
                }

                System.out.println(menu);
            }
            // Завершение программы
            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

        }
    }
}
