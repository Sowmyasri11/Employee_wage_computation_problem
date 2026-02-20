public class UC6WageTillCondition {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public void calculateWageTillCondition() {
        int maxHours = 100;
        int maxDays = 20;

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHours && totalDays < maxDays) {
            totalDays++;
            int empCheck = (int)(Math.random() * 3);

            int hours = switch (empCheck) {
                case FULL_TIME -> 8;
                case PART_TIME -> 4;
                default -> 0;
            };

            totalHours += hours;
        }

        int totalWage = totalHours * WAGE_PER_HOUR;

        System.out.println("UC6: Total Wage (Till Limit) = " + totalWage);
    }
}
