import  java.util.*;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;

        int temp=0;
        int rev=0;
        while (n!=0){
            temp=n%10;
            rev=temp+rev*10;
            n/=10;
        }
        System.out.println(rev);
        if(rev==org) System.out.println("Its a Palindrome");
        else System.out.println("Its not a Palindrome");
    }
}
