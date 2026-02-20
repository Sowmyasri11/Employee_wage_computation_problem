public class UC4SwitchCaseWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public void calculateWageUsingSwitch() {
        int empCheck = (int)(Math.random() * 3); // 0,1,2
        int hours;

        switch (empCheck) {
            case FULL_TIME -> hours = 8;
            case PART_TIME -> hours = 4;
            default -> hours = 0;
        }

        int wage = hours * WAGE_PER_HOUR;
        System.out.println("UC4: Wage Using Switch = " + wage);
    }
}
