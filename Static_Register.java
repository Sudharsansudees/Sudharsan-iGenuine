import java.util.*;

class Register{
    static int startingRegisterNumber = 1000;
    int regnumber;
    String name;
    String dept;
    String mail;
    
    Register(String name, String dept, String mail){
        regnumber=startingRegisterNumber++;
        this.name=name;
        this.dept=dept;
        this.mail=mail;

    }
    void Print(){
        System.out.println("Regnumber: "+regnumber);
        System.out.println("name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Mail: "+mail);
        System.out.println();
    }

}

public class Static_Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register s1 = new Register("Sudharsan","CSE","123@gmail.com");
        Register s2 = new Register("Prag","CSE","454@gmaiil.com");
        Register s3 = new Register("Sudee","CSE","678@gmail.com");

        s1.Print();
        s2.Print();
        s2.Print();

        
        
    }
}

