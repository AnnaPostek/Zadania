package Klimatyzator;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(5);
BuildingController buildingController = new BuildingController(building);
buildingController.controlLoop();
    }
}
