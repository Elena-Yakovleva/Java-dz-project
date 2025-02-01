package additionalTasks.guessLeapYear;

public class Years {
    public  int year;
    int daysYear;

    public int calculate(int year){
        if (year < 0) {
            System.out.println("Год не может быть отрицательным!");
        } else if (year % 400 == 0) {
            daysYear = 366;
        } else if (year % 100 == 0) {
            daysYear = 365;
        } else if (year % 4 == 0) {
            daysYear = 366;
        } else {
            daysYear = 365;
        }
        return daysYear;
    }
}
