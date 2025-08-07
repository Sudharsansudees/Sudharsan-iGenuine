package ListCollection;
import java.util.*;

public class SetExample {
    public static void main(String[]args){
        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(13);
        num.add(4);
        num.add(1);
        num.add(1);
        //System.out.println(num);
        Set<String> name = new HashSet<>();
        name.add("Chennai");
        name.add("chennai");
        name.add("Chennai ");
        name.add("CHENNAI");
        name.add("chennai");
        name.add("");
        name.add("");
        name.add("Chennai");
        System.out.println(name);
        System.out.println(name.size());


    }
}
