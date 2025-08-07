import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine().toLowerCase();
        

        int[] size = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            size[ch]++;
        }

        boolean[] printed = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!printed[ch]) {
                System.out.println(ch + " = " + size[ch]);
                printed[ch] = true;
            }
        }
    }
}
