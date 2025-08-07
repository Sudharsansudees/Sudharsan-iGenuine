import java.util.*;

public class WPattern {

    public void W(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) System.out.print("*");
            }
            
            for(int j=n;j>=i+2;j--){
                System.out.print(" ");
            }
            System.out.println("*");
            // for(int j=i+2;j<=n;j++){
            //     System.out.print("*");
            // }
            // System.out.println();

            
            
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WPattern obj = new WPattern();

        int n=sc.nextInt();

        obj.W(n);
    }
}
