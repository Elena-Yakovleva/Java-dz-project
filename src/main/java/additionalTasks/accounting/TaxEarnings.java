package additionalTasks.accounting;

public class TaxEarnings {

    // УСН доходы - налог 6% от доходов;
    public static int taxEarnings(int earnings) {
        int tax = (earnings * 6) / 100;
        return tax;
    }
}
