package Klimatyzator;

import java.util.Random;

public class Building {

    private Room[] rooms;

    public Building(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        generateRoom();
    }

    private void generateRoom() {
        Random random = new Random();
        for (int i = 0; i < rooms.length; i++) {
            int currentTemperature = 20 + random.nextInt(15);
            int targetTemperature = currentTemperature-random.nextInt(5);
            int volume = 15 + random.nextInt(15);
            AirConditioner randomAirConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i + 1, currentTemperature, targetTemperature, volume, randomAirConditioner);
        }
    }

    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            return new BasicAirConditioner();
        } else {
            return new ProAirConditioner();
        }
    }

    public boolean areAllRoomsCool() {
        for (Room room : rooms) {
            if (room.getCurrentTemperature() > room.getTargetTemperature())
                return false;
        }
        return true;
    }

    public void coolRooms() {
        for (Room room : rooms) {
            room.cool();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Room room : rooms) {
            stringBuilder.append(room.toString()).append("\n");
        }
        return stringBuilder.toString();

    }
}
