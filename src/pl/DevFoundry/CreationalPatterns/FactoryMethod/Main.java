package pl.DevFoundry.CreationalPatterns.FactoryMethod;

import pl.DevFoundry.CreationalPatterns.FactoryMethod.units.Factory;
import pl.DevFoundry.CreationalPatterns.FactoryMethod.units.Unit;
import pl.DevFoundry.CreationalPatterns.FactoryMethod.units.UnitFactory;
import pl.DevFoundry.CreationalPatterns.FactoryMethod.units.UnitType;

public class Main {

    public static void main(String[] args) {

        //Unit tank = new Tank(200,0,20);
        //Unit infantryman = new Rifleman(100, 0 ,10);

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
