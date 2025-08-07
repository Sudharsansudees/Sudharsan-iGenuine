package AutoMobile;

abstract class Vehicle{
    private String Model_Name;


    Vehicle(String Model_Name){
        this.Model_Name=Model_Name;

    }

    public String getModel_Name() {
        return Model_Name;
    }

    abstract void start();
    abstract void stop();
}