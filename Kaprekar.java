import java.util.*;

public class Kaprekar {

    public static boolean Same(int n) {
        if (n == 1) return true;
        if (n < 1) return false;

        long square = (long) n * n;
        String result = Long.toString(square);

        for (int i = 1; i < result.length(); i++) { 
            String left = result.substring(0, i);
            String right = result.substring(i);

            int leftnum = Integer.parseInt(left);
            int rightnum = Integer.parseInt(right);

            if (rightnum != 0 && (leftnum + rightnum == n)) {
                return true;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Same(n)) {
            System.out.print("Kaprekar");
        } else {
            System.out.print("Non Kaprekar");
        }
    }
}
