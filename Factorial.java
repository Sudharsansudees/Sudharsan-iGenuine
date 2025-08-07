import java.util.*;

public class Factorial {
    
    public static int Fact(int n){
        if(n<=1){
            return 1;
        }else{
            return n*Fact(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=Fact(n);
        System.out.println(result);
    }
}
