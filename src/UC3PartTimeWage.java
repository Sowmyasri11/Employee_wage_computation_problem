public class UC3PartTimeWage {
    public static final int WAGE_PER_HOUR = 20;

    public void calculatePartTimeWage() {
        int hours = 4;
        int wage = hours * WAGE_PER_HOUR;
        System.out.println("Part-Time Employee Wage: " + wage);
    }
}
