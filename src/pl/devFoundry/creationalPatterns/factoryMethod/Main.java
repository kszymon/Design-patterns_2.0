package pl.devFoundry.creationalPatterns.factoryMethod;

import pl.devFoundry.creationalPatterns.factoryMethod.units.Factory;
import pl.devFoundry.creationalPatterns.factoryMethod.units.Unit;
import pl.devFoundry.creationalPatterns.factoryMethod.units.UnitFactory;
import pl.devFoundry.creationalPatterns.factoryMethod.units.UnitType;

public class Main {

    public static void main(String[] args) {

        //Unit tank = new Tank(200,0,20);
        //Unit infantryman = new Rifleman(100, 0 ,10);

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
