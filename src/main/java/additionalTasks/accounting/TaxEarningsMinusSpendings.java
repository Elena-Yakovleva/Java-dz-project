package additionalTasks.accounting;

public class TaxEarningsMinusSpendings {

    // УСН доходы минус расходы - налог 15% от разницы доходов и расходов.
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}
