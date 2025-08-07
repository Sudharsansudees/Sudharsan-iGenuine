import java.util.*;

class hollow_quare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int length = n-1;
        int breadth = n;

        for(int i = 1; i <= breadth; i++) {
            for(int j = 1; j <= length; j++) {
                if(i == 1 || i == breadth || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
