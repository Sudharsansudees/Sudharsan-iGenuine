package AutoMobile;

public class Oops3 {
    public static void main(String[]args){
        Owner obj = new Owner("Sudheesh", "TVS", "Ferrari Version");

        Owner obj1 = new Owner("Prag", "Cycle", "Old Version");
        obj.Display();
        obj.start();
        obj.stop();
        Drivable.maxSpeed();
//        Drivable.fuelType();
        System.out.println();
        obj1.Display();

    }
}
