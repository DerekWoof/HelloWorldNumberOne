package Help;

public class DayMonthChangeNumbers {

    public String[] args;

    int num = Integer.parseInt(args[0]);
    int days = num % 30;
    int month = num / 30;

    public DayMonthChangeNumbers() {
        System.out.println(num + " days = " + month + " Month and "
                + days + "days");
    }
}
