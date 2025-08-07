import java.util.*;

public class Class_Object {

    public void Add(int a,int b){
        
        System.out.println(a+b);
    }
    public void sub(int a, int b){
       
        System.out.println(a-b);
    }

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Class_Object obj = new Class_Object();

        int a=sc.nextInt();
        int b=sc.nextInt();
        

        obj.Add(a,b);
        obj.sub(a,b);


    }
}
