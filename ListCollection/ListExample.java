package ListCollection;
import java.util.*;

public class ListExample {
    public static void main(String[]args){
        List<String> name = new ArrayList<>();
        name.add("Pragatheesh");
        name.add("Sudhee");
        name.add("Suhee");

        System.out.println(name);
        System.out.println(name.get(0));
        name.remove(1);
        System.out.println(name);

    }
}
