import java.util.*;

public class MarkSheet {

    public void Total(int C1,int C2,int C3,int C4,int C5){
        System.out.println("Total Marks : " + C1+C2+C3+C4+C5);

    }

    public int Average(int C1,int C2,int C3,int C4,int C5){
        double avg=(C1+C2+C3+C4+C5)/5;

        System.out.println("The Average = "+avg);

        return (int) avg;

    }

    public void Grade(int avg, int C1,int C2,int C3,int C4,int C5){
        if(C1<=35 || C2<=35 || C3<=35 || C4<=35 || C5<=35) System.out.println("The Grade : Fail");
        else if(avg>=90 && avg<=100) System.out.println("The Grade : O");
        else if(avg>=70 && avg<=89) System.out.println("The Grade : A+");
        else if(avg>=60 && avg<=79) System.out.println("The Grade : A");
        else if(avg>=50 && avg<=69) System.out.println("The Grade : B+");
        else if(avg>=40 && avg<=59) System.out.println("The Grade : B");
        else if(avg>=30 && avg<=49) System.out.println("The Grade : C");
        else System.out.println("The Grade : Fail");

        

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        MarkSheet obj = new MarkSheet();

        System.out.print("Enter Your Name : ");String name =sc.nextLine();

        System.out.print("Enter Subject 1 : ");int C1 = sc.nextInt();
        System.out.print("Enter Subject 2 : ");int C2 = sc.nextInt();
        System.out.print("Enter Subject 3 : ");int C3 = sc.nextInt();
        System.out.print("Enter Subject 4 : ");int C4 = sc.nextInt();
        System.out.print("Enter Subject 5 : ");int C5 = sc.nextInt();

        System.out.println();
        System.out.println("Student Name : " + name);

        obj.Total(C1, C2, C3, C4, C5);
        int avg = obj.Average(C1, C2, C3, C4, C5);
        
        obj.Grade(avg,C1, C2, C3, C4, C5);

        




    }
}
