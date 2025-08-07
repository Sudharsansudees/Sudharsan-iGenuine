import java.util.*;

public class ButterFly {

    public void Pattern(int n){
        for(int i=0;i<n*2;i++){
            for(int j=0;j<=i;j++){
                if(i==n)
                System.out.print("* ");
                break;
            
            }
            System.out.println();

            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
        }


        // for(int i=n;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ButterFly obj = new ButterFly();

        int n=sc.nextInt();
        obj.Pattern(n);

    }
}
