package lection3;

public class bonusesForPayments {
    public static void main(String[] args) {

        // Определение начального баланса
        int initialBalance = 100;

        // Определение суммы зачисленной на баланс
        int depositAmount = 1100;

        // Определение суммы, находящейся на счету
        int newBalance = depositAmount + initialBalance;

        // Определение бонуса, который клиент получает за внесение суммы равной или более 1000 руб.
        int bonusAmount = (depositAmount / 100);

        // Расчет через тернарного оператора
        System.out.println(depositAmount <= 1000 ?
                ("На Вашем счету сейчас: " + newBalance + " рублей.") :
                ("На Вашем счету сейчас: " + (newBalance + bonusAmount) + " рублей."));

    }

}
