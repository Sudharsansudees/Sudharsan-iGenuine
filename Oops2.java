class College1{
    String College_Name;
    static int College_Code;
    int code;

    College1(String College_Name){
        code=College_Code++;
        this.College_Name=College_Name;

    }
    void Display(){
        System.out.println("College Name: "+College_Name);
        System.out.println("College Code: "+College_Code);
    }
}


public class Oops2 {
    public static void main(String[]args){

    }
}
