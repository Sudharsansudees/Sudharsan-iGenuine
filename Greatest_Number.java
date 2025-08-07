import java.util.*;

public class Greatest_Number {
    public int Big(int arr[]) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greatest_Number obj = new Greatest_Number();

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int greatest = obj.Big(arr);
        System.out.println("GN: " + greatest);

       
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == greatest) {
                count++;
            }
        }

        if(count > 1) {
            System.out.print("Same: ");
            for(int i = 0; i < n; i++) {
                if(arr[i] == greatest) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
