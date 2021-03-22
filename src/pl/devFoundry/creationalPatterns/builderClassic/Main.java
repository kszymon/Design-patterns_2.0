package pl.devFoundry.creationalPatterns.builderClassic;

import pl.devFoundry.creationalPatterns.builderClassic.house.BigHouseBuilder;
import pl.devFoundry.creationalPatterns.builderClassic.house.House;
import pl.devFoundry.creationalPatterns.builderClassic.house.HouseDirector;
import pl.devFoundry.creationalPatterns.builderClassic.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

        // House hoouse1 = new House("walls", "floors", "rooms" , "windows", "doors", "garage");
        // House hoouse2 = new House("");

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}
