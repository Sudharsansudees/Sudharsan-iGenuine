public class Try {
    public static void main(String[]args){

        try {
            int[] number = {1, 2, 3};
            //int b = 10 / 0;
            int a = number[3];
        }
//        catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index is out of bound");
//        }
        catch (Exception e){
            System.out.println("General error "+e.getMessage());
        }
        finally {
            System.out.println("Finally Block Runs here");
        }
        System.out.println("out of Try- catch block");


    }
}
