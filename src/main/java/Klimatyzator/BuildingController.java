package Klimatyzator;

public class BuildingController {

    private Building building;

    public BuildingController(Building building) {
        this.building = building;
    }

   public void controlLoop(){
        while(!building.areAllRoomsCool()) {
            System.out.println(building);
            building.coolRooms();
            sleepOneSecound();
        }
       System.out.println("Wszystkie pomieszczenia są chłodzone do docelowej temperatury");
   }

    private void sleepOneSecound(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
