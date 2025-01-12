package lection6;


public class Main {
    public static void main(String[] args) {

        IncomeCalculationService service = new IncomeCalculationService();

        System.out.println("В этом году я гулял: " +service.calculate(10000,3000,20000) + " месяца.");
    }
}