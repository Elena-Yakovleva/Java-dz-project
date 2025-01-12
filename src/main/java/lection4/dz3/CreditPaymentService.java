public class CreditPaymentService {

    public int calculate (double loanAmount, double interestRate, int numMonths) {

        // loanAmount - сумма кредита
        // interestRate - процентная ставка
        // numMonths- количество месяцев
        // monthlyPayment - ежемесячный платеж

        // quarterlyInterestRate - переменная в которой хранится 1/12 процентной ставки деленная на 100%
        double quarterlyInterestRate = (interestRate / 12 / 100);

        // OnePlusInterestRate - переменная, в которой хранится выражение = (1 + процентная ставка)
        double OnePlusInterestRate = (1 + quarterlyInterestRate);

        // monthlyInterestFactor - переменная, в которой хранится выражение = (1 + процентная ставка) в степени количества месяцев
        double monthlyInterestFactor = Math.pow(OnePlusInterestRate, numMonths);

        // monthlyPayment - ежемесячный платеж

        double monthlyPayment =  loanAmount * quarterlyInterestRate * monthlyInterestFactor / (monthlyInterestFactor - 1);


        // System.out.println(quarterlyInterestRate);
        // System.out.println(OnePlusInterestRate);
        // System.out.println(monthlyInterestFactor);
        // System.out.println(monthlyPayment);

        return  (int) monthlyPayment;
    }

}
