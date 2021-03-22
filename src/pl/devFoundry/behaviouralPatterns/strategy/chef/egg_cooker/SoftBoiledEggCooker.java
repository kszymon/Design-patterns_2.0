package pl.devFoundry.behaviouralPatterns.strategy.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Gotuje jajka na miekko!");
    }
}
