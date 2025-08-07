import java.util.*;


public class Problem2 {
    public void P1(int arr[], int n){

        int result[]=new int[n];
            int count=0;


            for(int i=n-1;i>=0;i--){
                if(arr[i]<0){
                    result[count++]=arr[i];
                }
            }

            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    result[count++]=arr[i];
                }
            }
            
            for(int i=0;i<n;i++){
                System.out.print(result[i]+" ");
            }


            

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Problem2 obj = new Problem2();
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        obj.P1(arr,n);



    }
}
