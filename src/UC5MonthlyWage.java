public class UC5MonthlyWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;

    public void calculateMonthlyWage() {
        int workingDays = 20;
        int totalWage = workingDays * FULL_DAY_HOURS * WAGE_PER_HOUR;

        System.out.println("UC5: Monthly Wage = " + totalWage);
    }
}
