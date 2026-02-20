public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC1 - Check Attendance
        UC1CheckAttendance uc1 = new UC1CheckAttendance();
        uc1.checkAttendance();

        // UC2 - Daily Wage
        UC2DailyWage uc2 = new UC2DailyWage();
        uc2.calculateDailyWage();

        // UC3 - Part Time Wage
        UC3PartTimeWage uc3 = new UC3PartTimeWage();
        uc3.calculatePartTimeWage();

        // UC4 - Switch Case Wage
        UC4SwitchCaseWage uc4 = new UC4SwitchCaseWage();
        uc4.calculateWageUsingSwitch();

        // UC5 - Monthly Wage
        UC5MonthlyWage uc5 = new UC5MonthlyWage();
        uc5.calculateMonthlyWage();

        // UC6 - Wage Till Condition
        UC6WageTillCondition uc6 = new UC6WageTillCondition();
        uc6.calculateWageTillCondition();
    }
}
