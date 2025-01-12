public class Main {
    public static void main(String[] args) {

        CreditPaymentService service =  new CreditPaymentService();


        System.out.println();
        System.out.println("Сумма кредита: " + 1000000 + " руб. Процентная ставка: " + 9.99 + "%. Количество месяцев: " + 12 + ".");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 9.99, 12));

        System.out.println();
        System.out.println("Сумма кредита: " + 1000000 + " руб. Процентная ставка: " + 9.99 + "%. Количество месяцев: " + 24 + ".");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 9.99, 24));

        System.out.println();
        System.out.println("Сумма кредита: " + 1000000 + " руб. Процентная ставка: " + 9.99 + "%. Количество месяцев: " + 36 + ".");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 9.99, 36));

    }
}