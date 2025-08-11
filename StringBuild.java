import java.awt.*;

public class StringBuild {
    public static void main(String[]args){
        String str="waterbottle";
        String str1="erbottlewat";
        int k=str.length();
        String a="";
        String b="";
        for(int i=0;i<str.length();i++){
            if(i<3){
                a+=str.charAt(i);
            }else {
                b += str.charAt(i);
            }
            if(str1.equals(b+a)) System.out.println("True");
            else System.out.println("False");
        }







        //Task 2
//        String a =str.substring(str.length()-1);
//        String b=str.substring(1,str.length()-1);
//        String c=str.substring(0,1);
//        System.out.println(a+b+c);

//        System.out.println();
//        System.out.println(str.substring(0,4));
//        System.out.println(str.substring(0,4));
//        System.out.println(str.replace("World","Java"));
//        System.out.println(str.replaceFirst("o","@"));
//        System.out.println(str.);

//        String a="";
//        String b="";
//        int k=2;

//        for(int i=0;i<k;i++){
//                a+=str.charAt(i);
//        }
//        for(int i=k;i<str.length();i++){
//            b+=str.charAt(i);
//        }
//        System.out.println(b+a);

        //Task1

//        for(int i=0;i<str.length();i++){
//            if(i<k){
//                a+=str.charAt(i);
//            }else {
//                b += str.charAt(i);
//            }
//        }
//        System.out.println(b+a);







    }
}
