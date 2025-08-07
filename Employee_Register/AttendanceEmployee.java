package Employee_Register;
import java.util.*;


public class AttendanceEmployee extends Employee implements Markable{
    private int[] attendanceArray = new int[7];

    AttendanceEmployee(String Name,int Id, String Department){
        super(Name,Id,Department);

    }

    @Override
    public void markAttendance(int[] attendanceArray) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<7;i++){
            attendanceArray[i]=sc.nextInt();
        }

        this.attendanceArray=attendanceArray;
    }

    @Override
    public int calculatePresentDays(int[] attendanceArray) {
        int count=0;

        for(int i : attendanceArray){
            if(i==1) count++;

        }
        return count;
    }
    public void displayAttendance() {
        System.out.println("Attendance: " + Arrays.toString(attendanceArray));
        System.out.println("Total Present Days: " + calculatePresentDays(attendanceArray));
    }
}
