import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY = 8;
    public static final int PART_TIME = 4;
    public static final int FULL_TIME = 1;
    public static final int WORKING_DAYS = 20;
    public static final int MAX_HOURS = 100;
    public static final int MAX_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation ! ");
        checkAttendance();
        calculateDailyWage();
        calculatePartTimeWage();
        wageUsingSwitch();
        wageForMonth();
        totalWageTillCondition();
    }

    public static void checkAttendance() {
        Random rand = new Random();
        int randNUm = rand.nextInt(2);
        int IS_PRESENT = randNUm;
        int empcheck = (int) (Math.random() * 2);
        if (empcheck == IS_PRESENT) {
            System.out.println("Employee is present !");
        } else {
            System.out.println("Employee is not present !");
        }
    }

    public static void calculateDailyWage() {
        int employee_Wage = WAGE_PER_HOUR * FULL_DAY;
        System.out.println("Employee Daily Wage is " + employee_Wage);

    }

    public static void calculatePartTimeWage() {
        int empType = (int) (Math.random() * 2); // 0=part-time,1=full-time
        int hours = empType == 1 ? FULL_DAY : PART_TIME;

        int wage = hours * WAGE_PER_HOUR;
        System.out.println("Employee worked hours: " + hours);
        System.out.println("Wage: " + wage);
    }

    public static void wageUsingSwitch() {
        int empCheck = (int) (Math.random() * 3); // 0,1,2
        int hours = 0;

        switch (empCheck) {
            case FULL_TIME -> hours = 8;
            case PART_TIME -> hours = 4;
            default -> hours = 0;
        }

        int wage = hours * WAGE_PER_HOUR;
        System.out.println("Employee working Hours: " + hours);
        System.out.println("Employee Wage: " + wage);
    }

    public static void wageForMonth() {
        int dailyHours = 8;
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS; day++) {
            totalWage += dailyHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Wage for a Month: " + totalWage);
    }
    public static void totalWageTillCondition() {
        int totalHours = 0, totalDays = 0, totalWage = 0;

        while(totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;
            int empCheck = (int)(Math.random() * 3);
            int hours = switch(empCheck) {
                case FULL_TIME -> 8;
                case PART_TIME -> 4;
                default -> 0;
            };

            totalHours += hours;
            totalWage += hours * WAGE_PER_HOUR;
        }

        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Wage: " + totalWage);
    }

}