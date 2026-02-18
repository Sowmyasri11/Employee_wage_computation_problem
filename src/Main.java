import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int wage_per_hour = 20;
    public static int full_day_hours = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation ! ");
        checkAttendance();
        calculateDailyWage();
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
        int employee_Wage=wage_per_hour*full_day_hours;
        System.out.println("Employee Wage is "+employee_Wage);

    }

}