import java.util.*;

public class Fibonnaci {
    public static int Fib(int n){

        if(n==0) return 0;
        if(n==1) return 1;
        return Fib(n-1)+Fib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(Fib(i)+" ");
        }
        int result=Fib(n);
        System.out.print(result);
    }
}
