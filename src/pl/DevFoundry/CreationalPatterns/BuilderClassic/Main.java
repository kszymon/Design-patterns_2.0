package pl.DevFoundry.CreationalPatterns.BuilderClassic;

import pl.DevFoundry.CreationalPatterns.BuilderClassic.house.BigHouseBuilder;
import pl.DevFoundry.CreationalPatterns.BuilderClassic.house.House;
import pl.DevFoundry.CreationalPatterns.BuilderClassic.house.HouseDirector;
import pl.DevFoundry.CreationalPatterns.BuilderClassic.house.SmallHouseBuilder;

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
