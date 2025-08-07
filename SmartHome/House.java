package SmartHome;

public class House {

    Room room1;
    Room room2;

    House(Room room1, Room room2){
        this.room1=room1;
        this.room2=room2;
    }



    public  void showAllDevices(){
        room1.showRoomDevices();

             System.out.println();

        room2.showRoomDevices();
    }
    public void controlAllDevices() {
        System.out.println();
        room1.controlDevices();
        room2.controlDevices();
    }
}
