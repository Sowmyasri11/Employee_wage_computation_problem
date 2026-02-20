import java.util.Random;

public class UC1CheckAttendance {
    public void checkAttendance() {
        Random rand = new Random();
        int empCheck = rand.nextInt(2); // 0 or 1

        if (empCheck == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
