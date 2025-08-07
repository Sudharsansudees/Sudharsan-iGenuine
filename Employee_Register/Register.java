package Employee_Register;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AttendanceEmployee[] employees = new AttendanceEmployee[4];

        System.out.print("Enter Number of Employee: ");
        int n=sc.nextInt();
        sc.nextLine();



        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            sc.nextLine();

            AttendanceEmployee EP = new AttendanceEmployee(name, id, dept);
            System.out.println("Enter Attendance (7 values of 0/1):");
            int[] attendance = new int[7];
            EP.markAttendance(attendance);

            EP.showDetails();
            EP.displayAttendance();


        }

        System.out.println();
        Employee.showEmployeeCount();
    }
}
