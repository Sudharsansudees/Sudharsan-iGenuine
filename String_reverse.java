import java.util.*;

public class String_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine().toLowerCase();
        

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                
                System.out.print(ch);
            }
        }

        
    }
}
