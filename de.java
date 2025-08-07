import java.util.*;

public class de {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if(a.length() >= 10) {
            System.out.print(a.substring(5, 10));
        } else {
            System.out.println("Input string must be at least 10 characters.");
        }
    }
}
