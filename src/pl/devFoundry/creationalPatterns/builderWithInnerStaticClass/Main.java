package pl.devFoundry.creationalPatterns.builderWithInnerStaticClass;

import pl.devFoundry.creationalPatterns.builderWithInnerStaticClass.house.House;

public class Main {

    public static void main(String[] args) {

        // House hoouse1 = new House("walls", "floors", "rooms" , "windows", "doors", "garage");
        // House hoouse2 = new House("");
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roofs")
                .buildRooms("rooms")
                .build();

        System.out.println(house);
    }
}
