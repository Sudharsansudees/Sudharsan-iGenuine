package SmartHome;

public class Thermostat extends SmartDevice{
    private double temperature;

    public Thermostat(String DeviceName, double temperature){
        super(DeviceName);
        this.temperature=temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public void performFunction(){
        System.out.println(getDeviceName()+" is set to "+getTemperature());
     }
}
