package pl.devFoundry.creationalPatterns.abstractFactory;

import pl.devFoundry.creationalPatterns.abstractFactory.units.*;

public class Main {

    public static void main(String[] args) {

        //InfantryUnit tank = new Tank(200,0,20);
        //InfantryUnit infantryman = new Rifleman(100, 0 ,10);

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantryman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantryman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
    }
}
