import java.util.*;

public class Fac_Str_Palindrome {
    public static boolean isPalindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return isPalindrome(s, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean result = isPalindrome(s,0,s.length()-1);
        System.out.println(result);
        
    }
}
