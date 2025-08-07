import java.util.*;

public class sum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.nextLine();
        
        String n = sc.nextLine();
        
        for(int i=n.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }
    }
}
