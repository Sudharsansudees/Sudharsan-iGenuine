package SmartHome;

public abstract class SmartDevice {
    private String DeviceName;

    SmartDevice(String  DeviceName){
        this.DeviceName=DeviceName;

    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public abstract void  performFunction();
}
