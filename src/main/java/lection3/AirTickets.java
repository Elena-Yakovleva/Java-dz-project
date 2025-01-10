package lection3;

public class AirTickets {
    public static void main(String[] args) {

        // Объявление переменных для входа данных
        // Стоимость билета (руб.)
        int ticketPrice = 13_676;
        // Стоимость одной мили (руб.)
        int milePrice = 20;

        // Расчет количества бонусных милей
        int bonusMiles = ticketPrice / milePrice;

        // Вывод ответа
        System.out.println("Спасибо за покупку. Количество бонусных милей за покупку: " + bonusMiles);

    }
}
