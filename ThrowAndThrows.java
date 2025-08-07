public class ThrowAndThrows {

    private static void checkEligibliy(int age) throws Exception{
        if(age<18){
            throw new Exception("Not Eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String []args){
        try{
            checkEligibliy(17);
        }
        catch (Exception e){
            System.out.println("Caught Exception "+e.getMessage());
        }
    }

}
