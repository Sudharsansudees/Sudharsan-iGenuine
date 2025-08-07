import java.util.*;
public class Rec_Print_Num {
    public static int Num(int i,int n){
        
        if(i<=n){
            System.out.print(i+" ");
            return Num(i+1,n);
        }
        return 0;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        Num(1,n);
    }
}
