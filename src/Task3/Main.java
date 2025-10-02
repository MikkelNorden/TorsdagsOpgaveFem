package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4, 3);
        Room room2 = new Room(2, 1);
        Room room3 = new Room(1, 4);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 3);
        Building building2 = new Building(rooms, 4);

        System.out.println(countLampsInBuilding(building1));
        System.out.println(countRoomsInBuilding(building1));

        System.out.println(isNormal(building1));
        System.out.println(isNormal(building2));
    }

    static int countLampsInBuilding(Building building){
        int lamps = 0;
        for(Room room : building.getRooms()){
            lamps += room.getNumberOfLamps();
        }
        return lamps;
    }

    static int countRoomsInBuilding(Building building){
        int rooms = 0;
        for(Room room : building.getRooms()){
            rooms++;
        }
        return rooms;
    }

    static boolean isNormal(Building building){
        if (building.getNumberOfFloors() <= countRoomsInBuilding(building)){
            return true;
        } else {
            return false;
        }
    }
}