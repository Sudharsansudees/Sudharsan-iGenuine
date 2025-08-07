package SmartHome;

public class Contol {
    public static void main(String[] args) {
        Light L1 = new Light("Living Room Light",0);
        L1.setBrightnessLevel(78);
        Thermostat T1 = new Thermostat("Living Room Thermostat", 0);
        T1.setTemperature(22.2);

        Room livingRoom = new Room("Living Room", L1, T1);

        Light L2 = new Light("Bedroom Light", 0);
        L2.setBrightnessLevel(55);
        Thermostat T2 = new Thermostat("Bedroom Thermostat", 0);
        T2.setTemperature(25.0);

        Room bedroom = new Room("Bedroom", L2, T2);

        House house = new House(livingRoom, bedroom);
        house.showAllDevices();
        house.controlAllDevices();
    }
}
