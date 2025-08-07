package AutoMobile;

class Car extends Vehicle {
    String Brand;
    static int Number_Plate=100;
    private int num;

    Car(String Brand,String Model_Name){
        super(Model_Name);
        num=Number_Plate++;
        this.Brand=Brand;
    }

    public int getNum() {
        return num;
    }

    void start() {
        System.out.println("Start the Engine with a Key");
    }

    void stop() {
        System.out.println("Stop the Engine with Break");
    }
}