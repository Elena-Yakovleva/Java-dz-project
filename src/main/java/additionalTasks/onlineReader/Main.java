package additionalTasks.onlineReader;

import java.util.Scanner;

import static additionalTasks.onlineReader.User.getTotalOnline;

public class Main {
    public static void main(String[] args) {

        String menu = "Выбор книги для чтения:\n" +
                "1. Смерть на Ниле\n" +  // Агата Кристи
                "2. Пересекая границы\n" + // Ольга Громыко
                "3. Война и мир\n" +  // Лев Толстой
                "4. Тайный сыск царя Гороха\n" + // Андрей Белянин
                "5. Программируем на Java\n" +  // Марк Лой
                "\nДля перехода в меню программы введите \"menu\"\n" +
                "Для завершения программы введите \"end\"" +
                "\nДля просмотра пользователей онлайн введите \"user\"";

        Book book1 = new Book("Кристи", "Агата", 7, "Смерть на Ниле", "Детектив", 575, 1998, 958);
        Book book2 = new Book("Громыко", "Ольга", 55, "Пересекая границы", "Фэнтези", 645, 1997, 862);
        Book book3 = new Book("Толстой", "Лев", 69, "Война и мир", "Роман", 599, 1995, 799.5);
        Book book4 = new Book("Белянин", "Андрей", 23, "Тайный сыск царя Гороха", "Фэнтези", 723, 1992, 902.7);
        Book book5 = new Book("Лой", "Марк", 87, "Программируем на Java", "Учебник", 687, 1996, 889);

        User user1 = new User(1, "James", "Bond", "agent-007@gmail.com");
        User user2 = new User(3, "Hercule", "Poirot", "detective@yahoo.com");
        User user3 = new User(25, "Sherlock", "Holmes", "baker-street@uc.com");
        int totalOnline = User.getTotalOnline();


        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);

        while (true) {

            String input = scanner.nextLine();

            if ("1".equals(input) || "2".equals(input) || "3".equals(input) || "4".equals(input) || "5".equals(input)) {

                int option = Integer.parseInt(input);

                switch (option) {

                    case 1:
                        System.out.println(book1.toString() + "\n\nДля перехода в меню программы введите \"menu\"");
                        break;
                    case 2:
                        System.out.println(book2.toString() + "\n\nДля перехода в меню программы введите \"menu\"");
                        break;
                    case 3:
                        System.out.println(book3.toString() + "\n\nДля перехода в меню программы введите \"menu\"");
                        break;
                    case 4:
                        System.out.println(book4.toString() + "\n\nДля перехода в меню программы введите \"menu\"");
                        break;
                    case 5:
                        System.out.println(book5.toString() + "\n\nДля перехода в меню программы введите \"menu\"");
                        break;
                    default:
                        System.out.println("\nТакой вариант отсутствует");

                }

            }
            if ("menu".equals(input)) {
                System.out.println("\n" + menu);
            }

            if ("end".equals(input)) {
                System.out.println("\nПрограмма завершена");
                break;
            }
            if ("user".equals(input)) {
                System.out.println("Пользователи онлайн: " + totalOnline);
                System.out.println();
            }

        }

    }
}
