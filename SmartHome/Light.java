package SmartHome;

public class Light extends SmartDevice{
    private int BrightnessLevel;
    int level;

    public Light(String DeviceName,int BrightnessLevel) {
        super(DeviceName);
        this.BrightnessLevel=BrightnessLevel;
    }

    public int getBrightnessLevel() {
        return BrightnessLevel;
    }

    public void setBrightnessLevel(int level) {
        BrightnessLevel = level;
    }

    public void performFunction() {
        System.out.println(getDeviceName() + " is adjusting brightness to " + getBrightnessLevel() + "%");
    }


}
