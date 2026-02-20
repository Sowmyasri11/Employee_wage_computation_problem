public class UC2DailyWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public void calculateDailyWage() {
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
