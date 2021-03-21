package pl.DevFoundry.BehaviouralPatterns.Strategy.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Gotuje jajka na twardo!");
    }
}
