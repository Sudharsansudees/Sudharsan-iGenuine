package AutoMobile;

interface Drivable{
    void drive();
    default void fuelType(){
        System.out.println("Petrol");
    }
    static void  maxSpeed(){
        System.out.println("Max Speed 280");
    }

}
